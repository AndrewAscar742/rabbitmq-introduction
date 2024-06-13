package br.com.valdir.producer.services;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dtos.ProductDTO;

import static br.com.valdir.producer.config.RabbitMQConfig.*;

@Service
public class ProductService {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;

	public void sendMessage(ProductDTO message) {
		System.out.println("Mandando mensagem");
		rabbitTemplate.convertAndSend(EXG_NAME_MARKETPLACE, RK_PRODUCT_LOG, message);
		
	}

}
