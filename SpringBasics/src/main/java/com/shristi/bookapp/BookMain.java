package com.shristi.bookapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BookMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.shristi");
		String[] beannames = context.getBeanDefinitionNames();
//		for (String bean : beannames) {
//			System.out.println(bean);
//		}
		
		IBookService bookService = (IBookService)context.getBean("bookServiceImpl");
		bookService.getAll().forEach(System.out::println);
		
		System.out.println();
		for (String book : bookService.getAll()) {
			System.out.println(book);
		}
	}

}
