package com.chakiso.product_service.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(value = "products")
public class Product {
    private String id;
    private String name;
    private String description;
    private Double price;
}
