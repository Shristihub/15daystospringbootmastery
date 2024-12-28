package com.productapp.model;

import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

	// while querying - getting data from db
	public ProductDTO convertToDTO(Product product) {
		// create a product dto obejct
		ProductDTO productDTO = new ProductDTO();
		// get the values of product
		String productName = product.getProductName();
		String brand = product.getBrand();

		// set the values to ProductDTO
		productDTO.setBrand(brand);
		productDTO.setProductName(productName);
		productDTO.setCategory(product.getCategory());
		productDTO.setProductId(product.getProductId());
		productDTO.setPrice(product.getPrice());

		// return the product dto object
		return productDTO;
	}

	// call this while useing add, update methods
	public Product convertToEntity(ProductDTO productDTO) {
		// create an object of product
		Product product = new Product();
		// call the setter methods
		product.setProductName(productDTO.getProductName());
		product.setCategory(productDTO.getCategory());
		product.setProductId(productDTO.getProductId());
		product.setPrice(productDTO.getPrice());
		product.setBrand(productDTO.getBrand());
		return product;
	}
}
