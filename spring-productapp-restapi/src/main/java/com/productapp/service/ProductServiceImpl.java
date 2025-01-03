package com.productapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.model.Product;
import com.productapp.model.ProductDTO;
import com.productapp.model.ProductMapper;
import com.productapp.repository.IProductRepository;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	private IProductRepository productRepository;
	@Autowired
	private ProductMapper mapper;

	@Override
	public void addProduct(ProductDTO productDTO) {
		Product product = mapper.convertToEntity(productDTO);
		productRepository.save(product);
	}

	@Override
	public void updateProduct(ProductDTO productDTO) {
		// check if produtId is available
		// if so update the product
		// else create a new row
		Product product = mapper.convertToEntity(productDTO);
		productRepository.save(product);

	}

	@Override
	public void deleteProduct(int productId) {
		productRepository.deleteById(productId);
	}

	@Override
	public List<ProductDTO> getAllProducts() {
		List<Product> products =  productRepository.findAll();
		List<ProductDTO>  productDTOList = convertToDtoList(products);
		return productDTOList;
	}

	@Override
	public ProductDTO getById(int productId) {
		Optional<Product> productOpt = productRepository.findById(productId);
		if (productOpt.isPresent()) {
			Product product =  productOpt.get();
		   return mapper.convertToDTO(product);
		}
		throw new ProductNotFoundException("invalid id");
		
		
	}

	@Override
	public List<ProductDTO> getByBrand(String brand) {
		// get the products
		List<Product> products = productRepository.findByBrand(brand);
//		// create a list of productdto
//		List<ProductDTO> productDTOList = new ArrayList<>();
//		//iterate thru the product list
//		for (Product product : products) {
////			convert product obj to product dto object
//			ProductDTO productDTO = mapper.convertToDTO(product);
//			// add the productdto object to temp list
//			productDTOList.add(productDTO);
//		}

		// --------------using streams api....................
		// convert to stream
		// call map method to convert product obj to product dto object
		// convert the stream of productdto objects to List<ProductDTO>
		// objects using collect method

		List<ProductDTO> productDTOList = products
				   .stream()
				   .map(product -> mapper.convertToDTO(product))
				.collect(Collectors.toList());

		// handle the exception
		if (productDTOList.isEmpty())
			throw new ProductNotFoundException("product with this brand not found");

		return productDTOList;

	}

	@Override
	public List<ProductDTO> getByBrandNamecontains(String brand, String productName) {
		List<Product> products = productRepository.readByBrandAndProductNameContaining(brand, productName);
		List<ProductDTO>  productDTOList = convertToDtoList(products);
		// handle the exception
		if (productDTOList.isEmpty())
			throw new ProductNotFoundException("product with this brand and name not found");
		return productDTOList;
		
	}

	@Override
	public List<ProductDTO> getByCat(String category) {
		List<Product> products = productRepository.getByCat(category);
		List<ProductDTO>  productDTOList = convertToDtoList(products);
		// handle the exception
		if (productDTOList.isEmpty())
			throw new ProductNotFoundException("product with this category not found");
		return productDTOList;
	}

	@Override
	public List<ProductDTO> getByBrandPriceLess(String brand, double price) {
		List<Product> products = productRepository.getByBrandPriceLess(brand, price);
		List<ProductDTO>  productDTOList = convertToDtoList(products);
		// handle the exception
		if (productDTOList.isEmpty())
			throw new ProductNotFoundException("product with this brand and price not found");
		return productDTOList;
	}

	@Override
	public List<ProductDTO> getByLesserPrice(double price) {
		List<Product> products = productRepository.getByLesserPrice(price);
		List<ProductDTO>  productDTOList = convertToDtoList(products);
		// handle the exception
		if (productDTOList.isEmpty())
			throw new ProductNotFoundException("product with this price not found");
		return productDTOList;
	}

	@Override
	public List<ProductDTO> getByCategoryName(String category, String productName) {
		List<Product> products = productRepository.getByCatNameContains(category, "%"+productName+"%");
		List<ProductDTO>  productDTOList = convertToDtoList(products);
		// handle the exception
		if (productDTOList.isEmpty())
			throw new ProductNotFoundException("product with this category and name not found");
		return productDTOList;
	}

	@Override
	public List<ProductDTO> getProductByBrand(String brand) {
		List<Product> products = productRepository.getProductByBrand(brand);
		List<ProductDTO>  productDTOList = convertToDtoList(products);
		// handle the exception
		if (productDTOList.isEmpty())
			throw new ProductNotFoundException("product with this category and name not found");
		return productDTOList;
	}

	@Override
	public List<ProductDTO> getByCatPriceLess(String category, double price) {
		List<Product> products = productRepository.getByCatPriceLess(category,price);
		List<ProductDTO>  productDTOList = convertToDtoList(products);
		// handle the exception
		if (productDTOList.isEmpty())
			throw new ProductNotFoundException("product with this category and price not found");
		return productDTOList;
	}
	
	private List<ProductDTO> convertToDtoList(List<Product> products){
			// convert to stream
			// call map method to convert product obj to product dto object
			// convert the stream of productdto objects to List<ProductDTO>
			// objects using collect method

	List<ProductDTO> productDTOList = products
			   			.stream()
			   			.map(product -> mapper.convertToDTO(product))
			   			.collect(Collectors.toList());
	return productDTOList;
	}

}
