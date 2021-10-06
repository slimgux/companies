package com.companies.controllers;

import com.companies.requests.PriceRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.time.LocalDateTime;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@SpringBootTest
@AutoConfigureMockMvc
class CompaniesControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void whenPostRequestToPriceAndValidRequest_thenCorrectResponse() throws Exception {
        var price = new PriceRequest();
        price.setPriceDate(LocalDateTime.now());
        price.setProductId(1);
        price.setBrandId(1);
        mockMvc.perform(post("/api/v1/price")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"priceDate\": \"2021-10-06T04:35:54.724Z\",\"productId\": 1,\"brandId\": 1}"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
