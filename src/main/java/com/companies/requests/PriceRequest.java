package com.companies.requests;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PriceRequest {
    private LocalDateTime priceDate;
    private Integer productId;
    private Integer brandId;
}
