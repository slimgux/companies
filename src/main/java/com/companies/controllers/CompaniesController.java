package com.companies.controllers;

import com.companies.requests.PriceRequest;
import com.companies.responses.PriceResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api/v1")
public class CompaniesController {

    @Operation(summary = "Get price")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Success")})
    @PostMapping(value = "/price", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PriceResponse> getPrice(@Valid @RequestBody PriceRequest priceRequest) {

        return ResponseEntity.ok(PriceResponse.builder().price(10.5).build());
    }
}
