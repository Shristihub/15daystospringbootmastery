package com.spring.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Employee {

	private String empName;
	private int empId;
	private Address address;
	@Value("${employee.empName}")
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Value("${employee.empId}")
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void printDetails() {
		System.out.println("Name "+empName);
		System.out.println("EmpId "+empId);
		String city = address.getCity();
		System.out.println("City "+city);
		System.out.println("State "+address.getState());
	}
}






