package com.dsloja.desafio_1.services;

import com.dsloja.desafio_1.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    @Autowired
    OrderService orderService;

    public double shipment(Order order) {
        if (orderService.total(order) < 100) {
            return orderService.total(order) + 20;
        } else if (orderService.total(order) >= 100 && orderService.total(order) < 200) {
            return orderService.total(order) + 12;
        } else {
            return orderService.total(order);
        }
    }

}
