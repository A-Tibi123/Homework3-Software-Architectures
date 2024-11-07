package org.example.service;

import lombok.extern.slf4j.Slf4j;
import org.example.Order;
import org.example.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderService {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order placeOrder(Order order) {
        log.info("Placing order: " + order);
        order.updateStatus("Placed");
        return orderRepository.save(order);
    }

}