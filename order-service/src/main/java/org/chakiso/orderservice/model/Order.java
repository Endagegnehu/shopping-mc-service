package org.chakiso.orderservice.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "t_order")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String orderNumber;
    @OneToMany(cascade = CascadeType.ALL)
    List<OrderLineItems> orderLineItems;
}
