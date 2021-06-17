package com.vm.entity;

public class Address {

	private String area;
	private int pincode;
	public Address(String area, int pincode) {
		super();
		this.area = area;
		this.pincode = pincode;
	}
	
	void displayAddress() {
		System.out.println("Area : "+area);
		System.out.println("Pincode :"+pincode);
	}
}
