package com.productapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.productapp.model.ProductDTO;
import com.productapp.service.IProductService;


@RestController
@RequestMapping("/product-api/v1")
public class ProductController {
	
	    //add IProductService as instance variable as dependency
	
		@Autowired
		private IProductService productService;

//		http://localhost:8080/product-api/v1/products
	    @PostMapping("/products")
		void addProduct(@RequestBody ProductDTO productDTO){
	    	productService.addProduct(productDTO);
	    	
	    }
	    
//	    http://localhost:8080/product-api/v1/products
	    @PutMapping("/products")
		void updateProduct(@RequestBody ProductDTO product){
	    	productService.updateProduct(product);
	    }
	    
//	    http://localhost:8080/product-api/v1/products/product-id/10
	    @DeleteMapping("/products/product-id/{productId}")
		void deleteProduct(@PathVariable int productId){
	    	productService.deleteProduct(productId);
	    }
	    
//	    http://localhost:8080/product-api/v1/products/product-id/10
	    @GetMapping("/products/product-id/{productId}")
	    ProductDTO getById(@PathVariable int productId){
	    	return productService.getById(productId);
	    	
	    }
	    
//	    http://localhost:8080/product-api/v1/products
	    @GetMapping("/products")
		List<ProductDTO> getAllProducts(){
	    	return productService.getAllProducts();
	    }
	    
//	    http://localhost:8080/product-api/v1/products/brand/Samsung
	    @GetMapping("/products/brand/{brand}")	
		List<ProductDTO> getByBrand(@PathVariable String brand) {
	    	return productService.getByBrand(brand);
	    }
//	    http://localhost:8080/product-api/v1/products/brand/Samsung/product-name/phones
	    @GetMapping("/products/brand/{brand}/product-name/{productName}")
		List<ProductDTO> getByBrandNamecontains(@PathVariable String brand,@PathVariable String productName){
	    	return productService.getByBrandNamecontains(brand, productName);
		}
//	    http://localhost:8080/product-api/v1/products/category?category=electronics
	    @GetMapping("/products/category")
		List<ProductDTO> getByCat(@RequestParam String category){
	    	return productService.getByCat(category);
	    }
	    
//	    http://localhost:8080/product-api/v1/products/brand/price?brand=Samsung&price=30000
	    @GetMapping("/products/brand/price")
		List<ProductDTO> getByBrandPriceLess(@RequestParam String brand,@RequestParam double price){
	    	return productService.getByBrandPriceLess(brand, price);
	    }
	    
//	    http://localhost:8080/product-api/v1/products/price/10000
	    @GetMapping("/products/price/{price}")
		List<ProductDTO> getByLesserPrice(@PathVariable double price){
	    	return productService.getByLesserPrice(price);
	    }
	    
//	    http://localhost:8080/product-api/v1/products/category/electronics/product-name/phones
	    @GetMapping("/products/category/{category}/product-name/{name}")
		List<ProductDTO> getByCategoryName(@PathVariable String category,@PathVariable("name") String productName){
	    	return productService.getByCategoryName(category, productName);
		}

//	    http://localhost:8080/product-api/v1/products/nbrand/Samsung
	    @GetMapping("/products/nbrand/{brand}")
		List<ProductDTO> getProductByBrand(@PathVariable String brand){
	    	return productService.getProductByBrand(brand);
	    }
	    
//	    http://localhost:8080/product-api/v1/products/category/electronics/price/1000
	    @GetMapping("/products/category/{category}/price/{price}")
		List<ProductDTO> getByCatPriceLess(@PathVariable String category,@PathVariable double price){
	    	return productService.getByCatPriceLess(category, price);
	    }

}
