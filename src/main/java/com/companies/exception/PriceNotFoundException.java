package com.companies.exception;

import com.companies.requests.PriceRequest;

import java.time.format.DateTimeFormatter;

public class PriceNotFoundException extends RuntimeException {

    public PriceNotFoundException(PriceRequest priceRequest) {
        super(String.format("Price with productId %d, brandId %d and date %s not found",
                priceRequest.getProductId(),
                priceRequest.getBrandId(),
                priceRequest.getPriceDate().format(DateTimeFormatter.ofPattern("yyyyy-MM-dd hh:mm:ss")))
        );
    }

}
