package com.vm.entity;

import java.util.List;
import java.util.Set;

public class Restaurant {

	
	String name;
	IHotDrink iHotDrink;
	List employees;
    Set menu;

	public void setMenu(Set menu) {
		this.menu = menu;
	}


	public void setEmployees(List employees) {
		this.employees = employees;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setiHotDrink(IHotDrink iHotDrink) {
		this.iHotDrink = iHotDrink;
	}


	public void displayReataurantDetails()
	{
		System.out.println("Restaurant name"+name);
	    iHotDrink.prepare();
	    System.out.println("employess are "+employees);
	    System.out.println("Menu "+menu);
	}
}
