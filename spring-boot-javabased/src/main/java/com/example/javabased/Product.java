package com.example.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Product {
	@Autowired
	@Qualifier("appliances")
	private Category category;
	
	public void showProducts() {
		category.getAllProducts().forEach(System.out::println);
	}
}
