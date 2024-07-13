package org.chakiso.orderservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "t_order_line_items")
@NoArgsConstructor
@AllArgsConstructor
public class OrderLineItems {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String skuCode;
    BigDecimal price;
    int quantity;
}
