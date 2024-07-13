package org.chakiso.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequestDto {
    Long id;
    String skuCode;
    BigDecimal price;
    int quantity;
}
