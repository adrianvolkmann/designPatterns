package com.volkmann.designPatterns;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestExamples {

	@PostMapping(value = "/hello")
	public String helloWorld() {

		

		return "Hello World!";
	}

}