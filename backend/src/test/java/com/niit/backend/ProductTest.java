package com.niit.backend;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.service.ProductService;

import com.niit.model.Product;





@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes = AppContext.class)
public class ProductTest {

	@Autowired
	ProductService productservice;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	productservice = null;
	}
	
	@Test
	public void addProduct() {
		Product product = new Product();
		product.setProductname("Tshirt");
		product.setPrice(100);
		product.setQuantity(2);
		product.setProductdesc("Tshirt prices have gone down");
		
		assertEquals(true, productservice.createProduct(product));
	
		}
	@Ignore
	@Test
	public void updateProduct()
	{
		Product product = productservice.getProductById(19);
		product.setPrice(400);
		product.setQuantity(5);
		assertEquals(true, productservice.updateProduct(product));
	}
	@Ignore
    @Test
	public void deleteProduct() {
		Product product=productservice.getProductById(20);
		assertEquals(true, productservice.deleteProduct(product));
	}
	@Ignore
    @Test
	public void productListTest() {

		List<Product> getProductList = productservice.getProductList();		
		assertEquals(1, getProductList.size());
	}

	
		
}


