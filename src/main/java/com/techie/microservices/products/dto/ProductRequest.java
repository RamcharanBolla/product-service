package com.techie.microservices.products.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

@Data
public class ProductRequest {


    private String id;

    private String name;

    private BigDecimal price;
    private String description;
}
