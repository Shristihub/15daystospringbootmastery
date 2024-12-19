package com.spring.setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

	private String city;
	private String state;
	public String getCity() {
		return city;
	}
	@Value("${employee.address.city}")
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	@Value("${employee.address.state}")
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
}
