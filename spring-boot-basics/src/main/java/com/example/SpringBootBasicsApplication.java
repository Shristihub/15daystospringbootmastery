package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.training.Student;

@SpringBootApplication //(scanBasePackages = {"com.example.demo","com.example.training"})
public class SpringBootBasicsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicsApplication.class, args);
	}
//	@Autowired
//	ApplicationContext context;
	
	private Student student;
	@Autowired	
	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public void run(String... args) throws Exception {
//		String[] beannames = context.getBeanDefinitionNames();
//		for (String bean : beannames) {
//			System.out.println(bean);
//		}
//		Student student = context.getBean("student",Student.class);
//		student.printDetails();
		
		student.printDetails();
		
	}

}
