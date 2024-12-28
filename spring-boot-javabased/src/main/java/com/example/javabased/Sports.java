package com.example.javabased;

import java.util.Arrays;
import java.util.List;

public class Sports implements Category {

	@Override
	public List<String> getAllProducts() {
		return Arrays.asList("Bat","Ball","Shoes");
	}

}
