package com.greetapp.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	@GetMapping("/greet/{username}")
	public String greetMessage(@PathVariable String username) {
		return "Great Day"+username;
	}
	@GetMapping("show-books")
	public List<String> showBooks(){
		return Arrays.asList("Java","React","Spring");
	}
}
