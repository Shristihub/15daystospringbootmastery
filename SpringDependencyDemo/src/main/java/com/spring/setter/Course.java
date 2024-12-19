package com.spring.setter;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Course {

	public List<String> getAll(String type){
		if(type.equals("frontend"))
			return Arrays.asList("Html","CSS","React");
		if(type.equals("backend"))
			return Arrays.asList("Spring","Java","Microservices");
		if(type.equals("database"))
			return Arrays.asList("MYSQL","MongoDB");
		else
			return Arrays.asList("No Courses available");
	}
}
