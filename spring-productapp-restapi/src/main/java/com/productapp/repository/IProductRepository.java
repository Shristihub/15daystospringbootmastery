package com.productapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.model.Product;
import com.productapp.model.ProductDTO;

@Repository
public interface IProductRepository extends JpaRepository<Product, Integer>{

	// derived queries- properties
	// method name shoud follow a pattern as readBy,getBy,findBy  -readByBrand findByCategory
	
	List<Product> findByBrand(String brand);
	List<Product> readByBrandAndProductNameContaining(String brand,String productName);
	
	
	//custom query  - JPQL - 
	// derived query name is long or entity classes are related
	// entity class name and the properties of entity class
	// method name can be anything. should be annotated with @Query
	// select * from product where category=?
	
	@Query("from Product p where p.category=?1")
	List<Product> getByCat(String category);
	
	// select * from product where brand=? and cost<?
	@Query("""
			from Product p where p.brand=?1
			and p.price <?2
			"""
			)
	List<Product> getByBrandPriceLess(String brand,double price);
	
	//native query - sql query
	// method name can be anything. should be annotated with @Query with  attributes
	@Query(value="select * from product where cost<?1",nativeQuery = true)
	List<Product> getByLesserPrice(double price);
	@Query(value=
			"""
			select * from product where category=?1
			and product_name like ?2
			"""
			,nativeQuery = true)
	List<Product> getByCatNameContains(String category,String productName);
	
	//Named Query
	// method name can be anything. should be annotated with @Query with  attributes
	@Query(name="getProductsByBrand")
	List<Product> getProductByBrand(String brand);
	
	@Query(name="getByCatPrice")
	List<Product> getByCatPriceLess(String category,double price);
	
	


}














