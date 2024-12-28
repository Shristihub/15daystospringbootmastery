package com.example.jbased;

import org.springframework.beans.factory.annotation.Value;

public class Address {

	private String city;
	@Value("${employee.address.city}")
	public void setCity(String city) {
		this.city = city;
	}
	public String getCity() {
		return city;
	}
	
	
}
