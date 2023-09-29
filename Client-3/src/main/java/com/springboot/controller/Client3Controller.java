package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class Client3Controller {

		@Autowired
		RestTemplate rest;
		
		@ResponseBody
		@GetMapping("/client3name/{id}")
		public String client3Name(@PathVariable int id) {
			
			/*** First Concept use of the RestTemplate class with getForObject method in Microservices***/
			
			//String client1name=rest.getForObject("http://localhost:8181/client1name/"+id, String.class);
			//String client2name=rest.getForObject("http://localhost:8182/client2name/"+id, String.class);
			//return "<br>(1).First Client Name::"+client1name+"<br>(2).Second Client Name::"+client2name+"<br>(3).Third Client Name::"+"FAIZ ANSARI MOHMMAD";
			
			
					/*** Second Concept of Microservices** */
			
			ResponseEntity<String> client1name=rest.exchange("http://localhost:8181/client1name/"+id, HttpMethod.GET, null, String.class);
			ResponseEntity<String> client2name=rest.exchange("http://locahost:8182/client2name/"+id, HttpMethod.GET,null, String.class);
			return "<br>(1).First Client Name::"+client1name+"<br>(2).Second Client Name::"+client2name;
		}
}
