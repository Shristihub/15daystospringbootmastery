package com.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CourseMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.autowire");
		Student student =  context.getBean("student",Student.class);
		student.showCourses("f").forEach(System.out::println);
		System.out.println();
		student.showCourses("b").forEach(System.out::println);
		System.out.println();
		student.showCourses("d").forEach(System.out::println);
		System.out.println();
		
	}
}
