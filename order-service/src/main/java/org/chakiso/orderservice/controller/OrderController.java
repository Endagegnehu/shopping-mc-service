package org.chakiso.orderservice.controller;

import org.chakiso.orderservice.dto.OrderRequest;
import org.chakiso.orderservice.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {
    public final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String placeOrder(@RequestBody OrderRequest orderRequest) {

        return "Order Placed Successfully";
    }

}
