package com.vm.entity;

public class Product {

	private int id;
	private String name;
	private int price;
	public Product(int id, String name, int price) {
		super();
		System.out.println("all parameter constructor");
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public Product(int id) {
		super();
		System.out.println("id constructor");
		this.id = id;
	}
	
	public Product(String name) {
		
		super();
		System.out.println("name constructor");
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
