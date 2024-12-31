package com.greetapp.controllers;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetController {

	@GetMapping("/greet")
	public String greetUser(Model model) {
		// calling the service layer
		//create data 
		String mymessage = "Have a good day";
//		attach data to model
		model.addAttribute("message",mymessage);
		// give the view page in the return statement
		return "hello";
	}
	@RequestMapping("/show-all")
	public String showAll(ModelMap map) {
		// call the service layer
		// service returns a list
		// attach the list to a model
		map.addAttribute("products",Arrays.asList("Mobile","Laptop"));
		// return the view page
		return "hello";
	}
	
	@GetMapping("welcome")
	public String welcomeUser(@RequestParam("username") String username, Model model) {
		String message = "Welcome "+username;
		model.addAttribute("usermessage", message);
		return "hello";
		
	}
	
}











