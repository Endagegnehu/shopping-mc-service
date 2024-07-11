package com.chakiso.product_service.controllers;

import java.util.List;

import com.chakiso.product_service.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.chakiso.product_service.dto.ProductRequest;
import com.chakiso.product_service.dto.ProductResponse;
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

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) 
    protected void createProduct(@RequestBody ProductRequest productRequest ) {
        log.info("{}.createProduct Product Request: {}", CLASS_NAME, productRequest);
        productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getMethodName() {
        log.info("{}.getAllProducts", CLASS_NAME);
        return productService.getAllProducts().stream().map(Utils::buildProductResponse).toList();
    }
    
}
