package com.shristi.bookapp;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements IBookService{

	@Override
	public List<String> getAll() {
		return List.of("Java","Spring","Microservices");
	}
	
	

}
