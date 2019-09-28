package com.niit.service;

import java.util.List;

import com.niit.model.Product;


public interface ProductService {

	public boolean createProduct(Product product);
	
	public boolean updateProduct(Product product);
	
	public boolean deleteProduct(Product product);
	
	public Product getProductById(int productId);
	
	public List<Product> getProductByPrice(int price);
	
	public List<Product> getProductList();
	
	public List<Product> getProductByName(String productname);
}