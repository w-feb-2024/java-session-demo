package com.sample.springbootrestmavendemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.springbootrestmavendemo.model.StudentPojo;

@RestController
public class HelloController {

	// create the endpoints
	// endpoints are urls with which we can access the rest method
	// create a method and use @GetMapping annotation above the method and specify the url
	
	//http://localhost:7070/api/hello
	@GetMapping("/api/hello")
	public String helloEndpoint() {
		return "Hello Spring REST";
	}
	
	// create an endpoint which will return a StudentPojo
	// http://localhost:7070/api/students
	@GetMapping("/api/students")
	public StudentPojo getStudent() {
		StudentPojo student = new StudentPojo(501, "abc", 80);
		return student;
	}
}
