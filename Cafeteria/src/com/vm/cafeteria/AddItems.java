package com.vm.cafeteria;

import java.util.LinkedHashMap;

import com.vm.entity.MenuItems;

public class AddItems {
 
	LinkedHashMap<MenuItems,Double> items=new LinkedHashMap<MenuItems,Double>();

	public void add(MenuItems m,Double cost)
	{
		items.put(m, cost);
	}
	Order order=new Order(items);
}
