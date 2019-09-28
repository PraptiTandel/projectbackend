package com.niit.service;

import java.util.List;

import com.niit.model.Order;

public interface OrderService {


	public boolean createOrder(Order order);
	
	public boolean deleteOrder(Order order);
	
	public boolean updateOrder(Order order);
	
	public Order getOrderById(int orderId);
	
	public List<Order> getOrderList();

	
	
}
