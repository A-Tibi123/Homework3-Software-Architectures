package org.example.handler;

import org.example.Order;

public class InventoryCheckHandler extends OrderValidationHandler {
    @Override
    public void validate(Order order) {
        System.out.println("Inventory check passed.");
        super.validate(order);
    }
}