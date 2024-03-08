package com.sample.springbootrestmavendemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	// create the endpoints
	// endpoints are urls with which we can access the rest method
	// create a method and use @GetMapping annotation above the method and specify the url
	@GetMapping("/api/hello")
	public String helloEndpoint() {
		return "Hello Spring REST";
	}
}
