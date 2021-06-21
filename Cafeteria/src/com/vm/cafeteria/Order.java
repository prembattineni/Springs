package com.vm.cafeteria;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import com.vm.entity.MenuItems;



public class Order {

	static LinkedHashMap<MenuItems,Double> items;
	//LinkedList<Double> orderitemscost=new LinkedList<Double>();
	LinkedHashMap<Integer,Double> orderitemscost=new LinkedHashMap<Integer,Double>();
	
	public Order(LinkedHashMap<MenuItems,Double> items) {
		this.items=items;
	}
	
	public Order() {
		
	}
	
	public LinkedHashMap<Integer,Double> order(String name,int quantity)
	{
		
		for (Entry<MenuItems, Double> entry : items.entrySet()) {
		       
	         if(entry.getKey().getName().equalsIgnoreCase(name)){
	        	 
	        	 
	        	 orderitemscost.put(entry.getKey().getId(),entry.getValue()*quantity);
	        	 break;
	         }
	        
	         
		}
		return orderitemscost;
		
	}

}
