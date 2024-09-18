package com.example.springboot_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontoller {
	
	@GetMapping("/display")
	public String diplay() {
		return "javatpoint";
	}	
	
	@GetMapping("/hello")
	public String hello() {
			return "hello";
		
	}

}
