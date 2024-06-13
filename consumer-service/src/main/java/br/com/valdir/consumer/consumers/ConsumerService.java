package br.com.valdir.consumer.consumers;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;

import dtos.ProductDTO;

@Configuration
public class ConsumerService {
	
	@RabbitListener(queues = "product.log")
	public void consumer(ProductDTO message){
		System.out.println("Consumer received a message: " + message.getId() + " Name: " + message.getNome());
	}
}
