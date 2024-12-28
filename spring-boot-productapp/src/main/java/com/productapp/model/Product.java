package com.productapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
//@Table(name = "product_details") // to give a different table name

@NamedQuery(name = "getProductsByBrand",query = "from Product p where p.brand=?1")
@NamedQuery(name="getByCatPrice",query="from Product p where p.category=?1 and p.price<?2")
public class Product {

	@Column(length=30)
	private String productName; 
	@Id
	@GeneratedValue
	private Integer productId;
	@Column(length=30)
	private String brand;  
	@Column(length=30)
	private String category;
	@Column(name = "cost")
	private double price;
	public Product(String productName, String brand, String category, double price) {
		super();
		this.productName = productName;
		this.brand = brand;
		this.category = category;
		this.price = price;
	}
	
	
	
}





