package com.dsloja.desafio_1.services;

import com.dsloja.desafio_1.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public double total(Order order) {
        return order.getBasic() - (order.getBasic() * order.getDiscount() / 100);
    }
}
