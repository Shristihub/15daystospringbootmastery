package com.greetapp.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

//	http://localhost:8080/greet

	// a REST API
	@GetMapping("/greet")
	public String greetMessage() {
		// calling the method of service
		// the data returned by the service will be resource
		// return the resource to the calling client

		// return a resource - a response
		return "Have a great day";
	}

//	http://localhost:8080/welcome?username=Priya&city=Goa
	@GetMapping("/welcome")
	public String welcomeUser(@RequestParam("username") String user, @RequestParam("city") String city) {
		return "Welcome " + user + " from " + city;
	}

//	http://localhost:8080/show-books/tech
//	http://localhost:8080/show-books/selfhelp
	@GetMapping("show-books/{category}")
	public List<String> showBooks(@PathVariable("category") String type) {
		if (type.equals("tech"))
			return Arrays.asList("Java", "Spring");
		else
			return Arrays.asList("Secret", "Leadership");
	}

}











