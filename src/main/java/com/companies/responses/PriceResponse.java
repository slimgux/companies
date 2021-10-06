package com.companies.responses;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class PriceResponse {
    private LocalDateTime startPriceDate;
    private LocalDateTime endPriceDate;
    private Integer productId;
    private Integer brandId;
    private Double price;
    private Integer rate;
}
