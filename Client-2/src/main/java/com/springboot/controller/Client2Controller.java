package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Client2Controller {

		
		@ResponseBody
		@GetMapping("/client2name/{id}")
		public String client2Name(@PathVariable int id) {
			
			  return "LAVKUSH KUMAR KESHARWANI";
		}
}
