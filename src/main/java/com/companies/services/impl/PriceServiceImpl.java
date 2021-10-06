package com.companies.services.impl;

import com.companies.entities.PriceEntity;
import com.companies.exception.PriceNotFoundException;
import com.companies.repositories.PriceRepository;
import com.companies.requests.PriceRequest;
import com.companies.responses.PriceResponse;
import com.companies.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.Objects;

@Service
public class PriceServiceImpl implements PriceService {

    private final PriceRepository priceRepository;

    @Autowired
    public PriceServiceImpl(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    @Override
    public PriceResponse findPriceFromDateAndProductAndBrand(PriceRequest priceRequest) {
        var prices = priceRepository.findByProductAndBrandDate(priceRequest.getBrandId(), priceRequest.getProductId(), priceRequest.getPriceDate());

        if (Objects.isNull(prices) || prices.isEmpty()) {
            throw new PriceNotFoundException(priceRequest);
        }
        var priceResult = prices.stream().max(Comparator.comparingInt(PriceEntity::getPriority)).orElseThrow();
        return PriceResponse.builder()
                .price(priceResult.getPrice())
                .brandId(priceResult.getBrandId())
                .productId(priceResult.getProductId())
                .startPriceDate(priceResult.getStartDate())
                .endPriceDate(priceResult.getEndDate())
                .priceList(priceResult.getPriceList())
                .build();

    }
}
