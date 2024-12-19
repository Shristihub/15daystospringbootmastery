package com.spring.constr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

	private String brand;
	private String model;
	private Insurance insurance;
	private Car car;
	// no need of autowired
	// no default constructor allowed
	public Vehicle(Insurance insurance) {
		super();
		this.insurance = insurance;
	}
	@Value("${vehicle.brand}")
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Value("${vehicle.model}")
	public void setModel(String model) {
		this.model = model;
	}


	public void showInsurance() {
		System.out.println("Printing Insurance for vehicle "+model);
		System.out.println(insurance.getType());
	}
	
	
}




