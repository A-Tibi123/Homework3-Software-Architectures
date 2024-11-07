package org.example.command;

import org.example.Order;
import org.example.service.OrderService;

public class PlaceOrderCommand implements OrderCommand {
    private final OrderService orderService;
    private final Order order;

    public PlaceOrderCommand(OrderService orderService, Order order) {
        this.orderService = orderService;
        this.order = order;
    }

    @Override
    public void execute() {
        orderService.placeOrder(order);
    }
}