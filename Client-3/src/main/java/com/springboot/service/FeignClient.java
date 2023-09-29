package com.springboot.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@org.springframework.cloud.openfeign.FeignClient(url="http://localhost:8181", value="client1")
public interface FeignClient {

		
		@GetMapping("client1name/{id}")
		public String getClient1Name(@PathVariable int id);
}
