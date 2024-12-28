package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.javabased.Electronics;
import com.example.javabased.HomeAppliances;
import com.example.javabased.Product;
import com.example.javabased.Sports;
import com.example.jbased.Address;
import com.example.jbased.Employee;

// many bean definitions
@Configuration
public class AppConfig {
	
	//bean definition - 
	// bean name is the method name getEmployee()
	@Bean
	public Employee getEmployee() {
		//create the employee object
		Employee employee = new Employee();
		// inject the address
		employee.setAddress(getAddress());
		return employee;
	}
	@Bean
	public Address getAddress() {
		return new Address();
	}
	
	@Bean
	public HomeAppliances appliances() {
		return new HomeAppliances();
	}
	
	@Bean
	@Primary
	public Sports sports() {
		return new Sports();
	}
	
	@Bean
	public Electronics electronics() {
		return new Electronics();
	}
	
	@Bean
	public Product product() {
		return new Product();
	}
	
	
	
	

}
