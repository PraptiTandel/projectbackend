package com.niit.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.service.OrderService;
import com.niit.dao.OrderDAO;
import com.niit.model.Order;

@Service
public class OrderServiceImpl implements OrderService {

	
	@Autowired
	OrderDAO orderdao;
	
	public boolean createOrder(Order order) {
		orderdao.createOrder(order);
		return true;
	}

	public boolean deleteOrder(Order order) {
		orderdao.deleteOrder(order);
		return true;
	}

	public boolean updateOrder(Order order) {
		orderdao.updateOrder(order);
		return true;
	}

	public Order getOrderById(int orderId) {
		return orderdao.getOrderById(orderId);
	}

	public List<Order> getOrderList() {
		return orderdao.getOrderList();
	}

}
