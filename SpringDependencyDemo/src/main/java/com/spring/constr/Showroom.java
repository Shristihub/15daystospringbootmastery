package com.spring.constr;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Showroom {

	private Car car;
	private Insurance insurance;
	// constr based
	public Showroom(Car car, Insurance insurance) {
		super();
		this.car = car;
		this.insurance = insurance;
	}

	public List<String> showBrands() {
		System.out.println(insurance.getType());
		return car.getAllBrands();
	}
}
