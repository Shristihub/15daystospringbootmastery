package com.spring.setter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class StudentDetails {
	private String studentName;
	private Course course;
	public String getStudentName() {
		return studentName;
	}
	@Value("${student.studentName}")
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Course getCourse() {
		return course;
	}
	@Autowired
	public void setCourse(Course course) {
		this.course = course;
	}
	
	public List<String>showCourses(String type){
		System.out.println("Showing courses for "+type);
		return course.getAll(type);
	}
	

}





