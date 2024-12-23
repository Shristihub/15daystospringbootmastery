package com.spring.autowire;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Databases extends CourseDetails {

	@Override
	List<String> getAllCourses() {
		return Arrays.asList("MYSQL","Oracle","MongoDB");
	}

}
