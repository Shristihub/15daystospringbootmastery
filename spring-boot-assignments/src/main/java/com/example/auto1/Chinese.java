package com.example.auto1;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Chinese implements IMenu {

	@Override
	public List<String> itemsAvailable() {
			return List.of("Fried Rice","Wonton Soup","Noodles");
	}

}
