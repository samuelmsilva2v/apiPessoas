package com.example.demo.configurations;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfiguration {

	@Bean
	Queue queue() {
		//nome da fila -> pessoas
		return new Queue("pessoas", true);
	}
}
