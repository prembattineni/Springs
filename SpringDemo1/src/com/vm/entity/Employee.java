package com.vm.entity;

public class Employee {

	private int id;
	private String name;
	private String dept;
	private Address address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	public void display()
	{
		System.out.println("Id "+id);
		System.out.println("name "+name);
		System.out.println("dept :"+dept);
		address.displayAddress();
	}
	
}
