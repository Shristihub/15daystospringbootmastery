package com.example.auto3;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CarFactory {

	@Autowired
	@Qualifier("convertible")
	private ICar car;
	
	@Autowired
	@Qualifier("hatchBack")
	private ICar hcar;
	
	@Autowired
	@Qualifier("sedan")
	private ICar scar;
	
	
	public List<String> checkBrands(String type){
		if(type.equals("s"))
			return scar.showBrands();
		if(type.equals("h"))
			return hcar.showBrands();
		if(type.equals("c"))
			return car.showBrands();
		return Arrays.asList("no cars available");
	}
	
}






