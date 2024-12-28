package com.productapp;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import com.productapp.model.Product;
import com.productapp.service.IProductService;

@SpringBootApplication
public class SpringBootProductappApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProductappApplication.class, args);
	}

	@Autowired
	private IProductService productService;

	@Override
	public void run(String... args) throws Exception { 
		// create only product DTO objects to call add product and update product
		
//		Product product = new Product("Microphone", "Moana", "Electronics", 20000);
//		productService.addProduct(product);
//
//		Product product1 = new Product("Television", "Samsung", "Electronics", 200000);
//		productService.addProduct(product1);
//		product1 = new Product("Head phones", "Samsung", "Electronics", 8000);
//		productService.addProduct(product1);
//		product1 = new Product("speakers", "Samsung", "Electronics", 2000);
//		productService.addProduct(product1);
//		product1 = new Product("head phones", "Bose", "Electronics", 5000);
//		productService.addProduct(product1);
//		product1 = new Product("Pencils", "Camlin", "Stationary", 200);
//		productService.addProduct(product1);
//		product1 = new Product("Pen", "Classmate", "Stationary", 500);
//		productService.addProduct(product1);
//		product1 = new Product("Color Pencils", "Camlin", "Stationary", 120);
//		productService.addProduct(product1);

//		
//		productService.getAllProducts().forEach(System.out::println);
//		
//		System.out.println("By Id");
//		ProductDTO nproduct = productService.getById(1);
//		System.out.println(nproduct);
//		System.out.println();
//		System.out.println("updating");
//		nproduct.setPrice(30000);
//		nproduct.setBrand("OnePlus");
//		productService.updateProduct(nproduct);
//		
//		System.out.println(nproduct);
//		productService.deleteProduct(2);
		System.out.println();

//		productService.getAllProducts().forEach(System.out::println);
//		System.out.println();
		
//		System.out.println("Get by brand");
//		productService.getByBrand("Samsung").forEach(System.out::println);
//		
//		System.out.println();
//		System.out.println("Get by brand and name");
//		productService.getByBrandNamecontains("Camlin","Pen").forEach(System.out::println);
//		
		
//		System.out.println();
//		System.out.println("Get by category");
//		productService.getByCat("Electronics").forEach(System.out::println);
//		
//		System.out.println();
//		System.out.println("Get by brand and price");
//		productService.getByBrandPriceLess("Samsung", 10000).forEach(System.out::println);
		
//		System.out.println();
//		System.out.println("Get by Lesser Price");
//		productService.getByLesserPrice(30000).forEach(System.out::println);
//		
//		System.out.println();
//		System.out.println("Get by category and name contains");
//		productService.getByCategoryName("Electronics", "phones").forEach(System.out::println);
//		
		System.out.println();
		System.out.println("Get by brand");
		productService.getProductByBrand("Samsung").forEach(System.out::println);
		
		System.out.println();
		System.out.println("Get by category and price less");
		productService.getByCatPriceLess("Electronics", 20000).forEach(System.out::println);
		
//		
	}

}



