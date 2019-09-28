package com.niit.dao;

import java.util.List;

import com.niit.model.Cart;

public interface CartDAO {

	public List<Cart> getCartList();
	
	public Cart getCartById(int cartId);
	
	public boolean addToCart(Cart cart);
	
	public boolean deleteFromCart(Cart cart);
}
