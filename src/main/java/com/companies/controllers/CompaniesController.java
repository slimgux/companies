package com.companies.controllers;
import com.companies.requests.PriceRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping(value = "/api/v1")
public class CompaniesController {

    @Operation(summary = "Get price")
    @ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Success") })
    @GetMapping("")
    public ResponseEntity<String> existeUsuario(@RequestBody(required = true) PriceRequest priceRequest) {
        if (Objects.nonNull(priceRequest)) {

        }
        return ResponseEntity.ok("KO");
    }
}
