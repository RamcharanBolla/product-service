package com.techie.microservices.products.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class ProductResponse {
    private String id;

    private String name;

    private BigDecimal price;
    private String description;
}
