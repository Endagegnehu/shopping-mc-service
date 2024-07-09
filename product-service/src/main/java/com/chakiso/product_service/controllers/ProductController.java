package com.chakiso.product_service.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.chakiso.product_service.dto.ProductRequest;
import com.chakiso.product_service.model.Product;
import com.chakiso.product_service.service.ProductService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
@Slf4j
public class ProductController {
    private static final String CLASS_NAME = ProductController.class.getSimpleName();
    private ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) 
    protected void createProduct(@RequestBody ProductRequest productRequest ) {
        log.info("{0}.createProduct Product Request: {1}", CLASS_NAME, productRequest);
        productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Product> getMethodName() {
        return productService.getAllProducts();
    }
    
}
