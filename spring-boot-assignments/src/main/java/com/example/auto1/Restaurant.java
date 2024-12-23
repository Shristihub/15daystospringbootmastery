package com.example.auto1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {
	@Autowired
	@Qualifier("indian")
	private IMenu menu;
	@Autowired
	private IMenu chinese;
	
	private IMenu imenu;
	
	public Restaurant(@Qualifier("italian")IMenu imenu) {
		super();
		this.imenu = imenu;
	}

	public void displayMenu() {
		menu.itemsAvailable().forEach(System.out::println);
		chinese.itemsAvailable().forEach(System.out::println);
		imenu.itemsAvailable().forEach(System.out::println);
	}

}
