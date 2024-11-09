package com.techie.microservices.products.service;

import com.techie.microservices.products.dto.ProductRequest;
import com.techie.microservices.products.dto.ProductResponse;
import com.techie.microservices.products.model.Product;
import com.techie.microservices.products.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public ProductResponse createProduct(ProductRequest productRequest){
        Product product = Product.builder()
                                .name(productRequest.getName())
                                        .id(productRequest.getId())
                                                .price(productRequest.getPrice())
                                                        .description(productRequest.getDescription()).build();

        productRepository.insert(product);
        ProductResponse productResponse = ProductResponse.builder().name(product.getName())
                                                .id(product.getId())
                .price(product.getPrice()).description(product.getDescription()).build();
        return productResponse;


    }

    public List<ProductResponse> getAllProducts(){
        return productRepository.findAll().stream().map(product-> {
            return ProductResponse.builder().name(product.getName())
                    .id(product.getId())
                    .price(product.getPrice()).description(product.getDescription()).build();
        }).collect(Collectors.toList());
    }
}
