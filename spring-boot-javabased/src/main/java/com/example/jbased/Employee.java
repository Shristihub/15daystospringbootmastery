package com.example.jbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Employee {

	private String empName;
//	@Autowired
	private Address address;
	
	
	@Value("${employee.empName}")
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void greetEmp() {
		System.out.println("Have a great day "+empName);
		System.out.println(address.getCity());
	}
}
