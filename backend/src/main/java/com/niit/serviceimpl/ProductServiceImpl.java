package com.niit.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.service.ProductService;
import com.niit.dao.ProductDAO;
import com.niit.model.Product;


@Service
public class ProductServiceImpl implements ProductService{
@Autowired
ProductDAO productdao;
	public boolean createProduct(Product product) {
		productdao.createProduct(product);
		return true;
	}

	public boolean updateProduct(Product product) {
		productdao.updateProduct(product);
		return true;
	}

	public boolean deleteProduct(Product product) {
		productdao.deleteProduct(product);
		return true;
	}

	public Product getProductById(int productId) {
		return productdao.getProductById(productId);
	}

	public List<Product> getProductList() {
		return productdao.getProductList();
	}

	public List<Product> getProductByName(String productname) {
		return productdao.getProductByName(productname);
	}

	public List<Product> getProductByPrice(int price) {
		return productdao.getProductByPrice(price);
	}
}
