package com.example.auto3;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class HatchBack implements ICar{

	@Override
	public List<String> showBrands() {
		return List.of("Tata","Suzuki");
	}

}
