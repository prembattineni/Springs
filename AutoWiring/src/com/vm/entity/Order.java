package com.vm.entity;

public class Order {

	private int orderId;
	private String productName;
	private int quantity;
	public Order(int orderId, String productName, int quantity) {
		super();
		this.orderId = orderId;
		this.productName = productName;
		this.quantity = quantity;
	}
	
	void displayOrderDetails()
	{
		System.out.println("======Order Details======");
		System.out.println("OrderId "+orderId);
		System.out.println("Product Name : "+ productName);
	    System.out.println("Quantity "+quantity);
	    System.out.println("==========================");
	
	}
}
