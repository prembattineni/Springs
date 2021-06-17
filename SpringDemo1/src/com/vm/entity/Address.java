package com.vm.entity;

public class Address {

	private int doorNo;
	private String streetName;
	private String city;
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public void displayEmployeeInfo()
	{
		System.out.println();
	}
	public void displayAddress()
	{
		System.out.println("DoorNo :"+doorNo);
		System.out.println("streetname :"+streetName);
		System.out.println("city : "+city);
	}
}
