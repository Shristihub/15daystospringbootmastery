package com.example.auto4;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Thriller implements IMovie {

	@Override
	public List<String> printMovies(String language) {
		if (language.equals("Tamil"))
			return Arrays.asList("12b", "24", "GOAT");
		if (language.equals("Telugu"))
			return Arrays.asList("RRR", "24", "sanivara");
		if (language.equals("English"))
			return Arrays.asList("Tangled", "Moana", "Mufasa");
		else
			return Arrays.asList("no movies");
		
	}

}
