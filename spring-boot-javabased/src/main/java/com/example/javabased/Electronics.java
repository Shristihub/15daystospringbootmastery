package com.example.javabased;

import java.util.Arrays;
import java.util.List;

public class Electronics implements Category {

	@Override
	public List<String> getAllProducts() {
		return Arrays.asList("Television","Xbox","Speakers");
	}

}
