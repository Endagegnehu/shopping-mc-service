package com.chakiso.product_service.util;

import com.chakiso.product_service.dto.ProductResponse;
import com.chakiso.product_service.model.Product;

public class Utils {
    public static ProductResponse buildProductResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }
}
