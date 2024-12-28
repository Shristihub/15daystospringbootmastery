package com.productapp.service;

import java.util.List;

import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.model.Product;
import com.productapp.model.ProductDTO;

public interface IProductService {
	// inbuilt methods
	void addProduct(ProductDTO productDTO) ;
	void updateProduct(ProductDTO product);
	void deleteProduct(int productId);
	List<ProductDTO> getAllProducts();
	ProductDTO getById(int productId);
	
	
	// querying the database
	//derives queries
	List<ProductDTO> getByBrand(String brand) throws ProductNotFoundException;
	List<ProductDTO> getByBrandNamecontains(String brand,String productName)throws ProductNotFoundException;
	
	//customQuery
	List<ProductDTO> getByCat(String category)throws ProductNotFoundException;
	List<ProductDTO> getByBrandPriceLess(String brand,double price)throws ProductNotFoundException;
	
	//nativequery
	List<ProductDTO> getByLesserPrice(double price)throws ProductNotFoundException;
	List<ProductDTO> getByCategoryName(String category,String productName)throws ProductNotFoundException;

	//named query
	List<ProductDTO> getProductByBrand(String brand)throws ProductNotFoundException;
	List<ProductDTO> getByCatPriceLess(String category,double price)throws ProductNotFoundException;

}







