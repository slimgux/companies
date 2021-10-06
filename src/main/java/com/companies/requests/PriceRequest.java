package com.companies.requests;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
public class PriceRequest {
    @NotNull(message = "priceDate is mandatory")
    private LocalDateTime priceDate;
    @NotNull(message = "productId is mandatory")
    private Integer productId;
    @NotNull(message = "brandId is mandatory")
    private Integer brandId;
}
