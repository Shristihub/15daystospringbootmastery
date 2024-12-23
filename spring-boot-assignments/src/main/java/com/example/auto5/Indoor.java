package com.example.auto5;

import org.springframework.stereotype.Component;

@Component
public class Indoor implements IGames {

	@Override
	public void gamesPlayed() {
		System.out.println("Chess");
		System.out.println("Table Tennis");
	}

}
