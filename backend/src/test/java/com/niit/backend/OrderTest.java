package com.niit.backend;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.service.OrderService;

import com.niit.model.Order;
import com.niit.model.Product;
import com.niit.model.User;



@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes = AppContext.class)
public class OrderTest {

	@Autowired
	OrderService orderservice;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		orderservice = null;
	}
	
	
	@Test
	public void createOrder() {
		Order order = new Order();  
		User u=new User();
		u.setUserId(1);
	 List<Product> list=new ArrayList<Product>();
      Product p=new Product();
		p.setProductId(7);
		list.add(p);
	order.setProductId(list);
		order.setUserid(u);
		order.setOrderdesc("bag order");
		order.setOrderprice(1822);
		order.setOrderstat("In Process");
		
		
		assertEquals(true, orderservice.createOrder(order));
	}
	@Ignore
	@Test
	public void updateOrder() {
		Order order = orderservice.getOrderById(22);
		order.setOrderprice(1700);
		assertEquals(true, orderservice.updateOrder(order));
	}
	@Ignore
	@Test
	public void deleteOrder() {
		Order order=orderservice.getOrderById(22);
		assertEquals(true, orderservice.deleteOrder(order));
	}
	@Ignore
	@Test
	public void orderListTest() {

		List<Order> getOrderList = orderservice.getOrderList();		
		assertEquals(1, getOrderList.size());
	}
}
