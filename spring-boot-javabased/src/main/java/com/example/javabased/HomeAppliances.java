package com.example.javabased;

import java.util.Arrays;
import java.util.List;

public class HomeAppliances implements Category {

	@Override
	public List<String> getAllProducts() {
		return Arrays.asList("Washing Machine","Mixer","Refrigerator");
	}

}
