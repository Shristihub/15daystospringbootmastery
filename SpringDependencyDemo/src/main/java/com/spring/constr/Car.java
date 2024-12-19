package com.spring.constr;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Car {

	public List<String> getAllBrands(){
		return List.of("Audi","Honda","Mahindra","Hyundai");
	}
}
