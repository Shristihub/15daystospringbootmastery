package com.spring.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Square implements IShape{

	@Override
	public void area(double x, double y) {
		System.out.println("Sq "+(x*x));
	}

}
