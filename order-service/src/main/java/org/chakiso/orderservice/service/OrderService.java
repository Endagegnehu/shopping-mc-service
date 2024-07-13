package org.chakiso.orderservice.service;

import org.chakiso.orderservice.dto.OrderRequest;
import org.chakiso.orderservice.dto.OrderRequestDto;
import org.chakiso.orderservice.model.Order;
import org.chakiso.orderservice.model.OrderLineItems;
import org.chakiso.orderservice.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    public void createOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());

        List<OrderLineItems> orderLineItems = orderRequest.getOrderLineItems().stream()
                .map(this::mapToOrderLineItemsDto).toList();
        order.setOrderLineItems(orderLineItems);
        orderRepository.save(order);
    }

    private OrderLineItems mapToOrderLineItemsDto(OrderRequestDto orderRequest) {
        OrderLineItems orderLineItems = new OrderLineItems();
        orderLineItems.setPrice(orderRequest.getPrice());
        orderLineItems.setQuantity(orderRequest.getQuantity());
        orderLineItems.setSkuCode(orderRequest.getSkuCode());
        return orderLineItems;
    }
}
