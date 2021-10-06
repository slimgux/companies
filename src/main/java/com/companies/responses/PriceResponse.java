package com.companies.responses;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public class PriceResponse {
    private LocalDateTime startPriceDate;
    private LocalDateTime endPriceDate;
    private Integer productId;
    private Integer brandId;
    private Double price;
    private Integer rate;
}
