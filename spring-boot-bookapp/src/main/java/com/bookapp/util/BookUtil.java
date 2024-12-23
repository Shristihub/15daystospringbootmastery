package com.bookapp.util;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bookapp.model.Book;

@Component
public class BookUtil {

	public List<Book> getAllBooks(){
		return Arrays.asList(
			new Book("Java in Action",1,"Kathy","Tech",900),
			new Book("Spring in Action",2,"John","Tech",1200),
			new Book("5am club",3,"Robin","selfhelp",450),
			new Book("HeadFirst JSP",4,"Kathy","Tech",1090),
			new Book("Java for dummies",5,"Kevin","Tech",1100),
			new Book("Secret",6,"Rhonda","selfhelp",780),
			new Book("Leadership",7,"Robin","selfhelp",550)
				);
	}
}
