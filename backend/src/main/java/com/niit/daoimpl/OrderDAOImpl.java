package com.niit.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.OrderDAO;
import com.niit.model.Order;


@Repository
@Transactional
public class OrderDAOImpl implements OrderDAO {

	@Autowired(required=true)
	SessionFactory sessionFactory;

	   public List<Order> getOrderList() {
		@SuppressWarnings("unchecked")
		List<Order> getOrderList = sessionFactory.getCurrentSession().createQuery("from Order").list();
		return getOrderList;
	}

	public boolean createOrder(Order order) {
		sessionFactory.getCurrentSession().save(order);
		return true;
	}

	public boolean updateOrder(Order order) {
		sessionFactory.getCurrentSession().update(order);
		return true;
	}

	public boolean deleteOrder(Order order) {
		sessionFactory.getCurrentSession().delete(order);
		return true;
	}

	public Order getOrderById(int orderId) {
		Order order = (Order) sessionFactory.getCurrentSession().createQuery("from Order where orderId = " + orderId).uniqueResult();
		return order;
	}

	
	
}