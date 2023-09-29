package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@EnableFeignClients
@SpringBootApplication
public class Client3Application {

	public static void main(String[] args) {
		SpringApplication.run(Client3Application.class, args);
		System.err.println("Spring Boot Starter*********************8183*****************");
	}
	
	@Bean
	public RestTemplate getRestTemplate() {
		
		   return new RestTemplate();
	}
}
