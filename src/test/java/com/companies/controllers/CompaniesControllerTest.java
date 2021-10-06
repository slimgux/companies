package com.companies.controllers;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@SpringBootTest
@AutoConfigureMockMvc
class CompaniesControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void whenPostRequestToPriceAndValidRequest_thenCorrectResponse() throws Exception {
        mockMvc.perform(post("/api/v1/price")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"priceDate\": \"2021-10-06T04:35:54.724Z\",\"productId\": 1,\"brandId\": 1}"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void whenPostRequestToPriceAndInValidRequest_thenInCorrectResponse() throws Exception {
        mockMvc.perform(post("/api/v1/price")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"priceDate\": \"2021-10-06T04:35:54.724Z\",\"productId\": 1}"))
                .andExpect(MockMvcResultMatchers.status().isBadRequest());
    }

    @Test
    void whenPostRequestToPriceAndValidRequestAndTest1_thenCorrectResponse() throws Exception {
        mockMvc.perform(post("/api/v1/price")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"priceDate\": \"2021-06-14T10:00:00.000Z\",\"productId\": 35455,\"brandId\": 1}"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.price", Is.is(10.5)));
    }

    @Test
    void whenPostRequestToPriceAndValidRequestAndTest2_thenCorrectResponse() throws Exception {
        mockMvc.perform(post("/api/v1/price")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"priceDate\": \"2021-06-14T16:00:00.000Z\",\"productId\": 35455,\"brandId\": 1}"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.price", Is.is(0)));
    }

    @Test
    void whenPostRequestToPriceAndValidRequestAndTest3_thenCorrectResponse() throws Exception {
        mockMvc.perform(post("/api/v1/price")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"priceDate\": \"2021-06-14T21:00:00.000Z\",\"productId\": 35455,\"brandId\": 1}"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.price", Is.is(0)));
    }

    @Test
    void whenPostRequestToPriceAndValidRequestAndTest4_thenCorrectResponse() throws Exception {
        mockMvc.perform(post("/api/v1/price")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"priceDate\": \"2021-06-15T10:00:00.000Z\",\"productId\": 35455,\"brandId\": 1}"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.price", Is.is(0)));
    }

    @Test
    void whenPostRequestToPriceAndValidRequestAndTest5_thenCorrectResponse() throws Exception {
        mockMvc.perform(post("/api/v1/price")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"priceDate\": \"2021-06-16T21:00:00.000Z\",\"productId\": 35455,\"brandId\": 1}"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.price", Is.is(0)));
    }
}
