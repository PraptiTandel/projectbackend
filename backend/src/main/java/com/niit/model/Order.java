package com.niit.model;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Orders")
public class Order{

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int orderId;
@Column(name = "Order_Description")
private String orderdesc;
@Column(name = "Order_Status")
private String orderstat;
@Column(name = "Order_Price")
private int orderprice; 

@OneToOne(fetch = FetchType.EAGER)
@JoinColumn(name="userId")
private User userid;


public void setUserid(User userid) {
	this.userid = userid;
}
@OneToMany(cascade=CascadeType.ALL,targetEntity=Product.class)
@JoinColumn(name="productId")
private List<Product> productId=new ArrayList<Product>();
public List<Product> getProductId() {
	return productId;
}
public void setProductId(List<Product> productId) {
	this.productId = productId;
}

public int getOrderprice() {
	return orderprice;
}
public void setOrderprice(int orderprice) {
	this.orderprice = orderprice;
}
public String getOrderstat() {
	return orderstat;
}
public void setOrderstat(String orderstat) {
	this.orderstat = orderstat;
}
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public String getOrderdesc() {
	return orderdesc;
}
public void setOrderdesc(String orderdesc) {
	this.orderdesc = orderdesc;
}


}