package com.example.auto;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
//	by type
	@Autowired
	@Qualifier("frontend")
	private ICourse course;
	//by name
	@Autowired
	private ICourse backend;
	
	//by constr
	private ICourse cloud;
	public Student(@Qualifier("cloudComputing") ICourse cloud) {
		super();
		this.cloud = cloud;
	}

	public List<String> showCourses(String choice){
		if(choice.equals("frontend"))
			return course.getAllCourses();
		if(choice.equals("backend"))
			return backend.getAllCourses();
		if(choice.equals("cloud"))
			return cloud.getAllCourses();
		return Arrays.asList("no courses available");
	}
}
