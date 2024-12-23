package com.example.auto4;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Theatre {

	@Autowired
	private IMovie thriller;
	
	@Autowired
	private IMovie horror;

	@Autowired
	private IMovie drama;
	
	public List<String> moviesRunning(String type, String language){
		if(type.equals("t"))
			return thriller.printMovies(language);
		if(type.equals("d"))
			return drama.printMovies(language);
		if(type.equals("h"))
			return horror.printMovies(language);
		return Arrays.asList("no movies");
	}
	
}
