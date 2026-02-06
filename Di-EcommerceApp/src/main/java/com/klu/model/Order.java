package com.klu.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Order {
	private int orderId;
	private String customerName;
	private String productName;
	@Value("4")
	private int quantity;
	
	public Order(@Value("101")int orderId, @Value("Gowtham")String customerName) {
		this.orderId=orderId;
		this.customerName=customerName;
		
	}
	@Value("Laptop")
	public void setProductName(String productName) {
		this.productName=productName;
	}
	public void display() {
		System.out.println("following order details : ");
		System.out.println("OrderID : "+orderId);
		System.out.println("CustomerName : "+customerName);
		System.out.println("ProductNAme : "+productName);
		System.out.println("quantity : "+quantity);
	}
}
