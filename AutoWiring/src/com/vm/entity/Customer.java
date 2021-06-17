package com.vm.entity;

public class Customer {

	private int id;
	private String name;
	private Address address;
	private Order order;  //in xml we declare bean for order class is id=order 
	                          //because we declare autowire="byName" it will check order in bean because it is order in this class
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	public void displayCustomerInfo()
	{
		System.out.println("Id : "+id);
		System.out.println("Name :"+name);
		order.displayOrderDetails();
		address.displayAddress();
	}
	
}
