package com.dsloja.desafio_1;

import com.dsloja.desafio_1.entities.Order;
import com.dsloja.desafio_1.services.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {

	@Autowired
	ShippingService shippingService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1304, 150.00, 20.0);

		System.out.println();
		System.out.println("Pedido código " + order.getCode());
		System.out.println("Valor total: R$ " + shippingService.shipment(order));
	}
}
