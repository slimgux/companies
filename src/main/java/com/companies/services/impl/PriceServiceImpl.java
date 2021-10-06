package com.companies.services.impl;

import com.companies.requests.PriceRequest;
import com.companies.responses.PriceResponse;
import com.companies.services.PriceService;
import org.springframework.stereotype.Service;

@Service
public class PriceServiceImpl implements PriceService {
    @Override
    public PriceResponse getPriceFromDateAndProductAndBrand(PriceRequest priceRequest) {
        return PriceResponse.builder().price(0.0).build();
    }
}
