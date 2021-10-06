package com.companies.services;

import com.companies.requests.PriceRequest;
import com.companies.responses.PriceResponse;

public interface PriceService {
    PriceResponse findPriceFromDateAndProductAndBrand(PriceRequest priceRequest);
}
