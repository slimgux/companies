package com.companies.requests;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
public class PriceRequest {
    @NotNull
    private LocalDateTime priceDate;
    @NotNull
    private Integer productId;
    @NotNull
    private Integer brandId;
}
