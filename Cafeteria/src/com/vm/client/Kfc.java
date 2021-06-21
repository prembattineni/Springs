package com.vm.client;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map.Entry;

import com.vm.cafeteria.AddItems;
import com.vm.cafeteria.Order;
import com.vm.entity.MenuItems;



public class Kfc {

	static void menu()
	{
		System.out.println("============Items===========");
		System.out.println("Name                 Cost");
		System.out.println(" 1.Big8              612.89");
		System.out.println(" 2.MinglesBucket     1009.72");
		System.out.println(" 3.DipsBucket        890.00");
		System.out.println(" 4.TripleTreat       256.09");
		System.out.println("============================");
	}
	static void add(AddItems additems)
	{
		MenuItems item1=new MenuItems();
		MenuItems item2=new MenuItems();
		MenuItems item3=new MenuItems();
		MenuItems item4=new MenuItems();
		
		item1.setId(1);
		item1.setName("Big8");
		
		item2.setId(2);
		item2.setName("MinglesBucket");
		
		item3.setId(3);
		item3.setName("DipsBucket");
		
		item4.setId(4);
		item4.setName("TripleTreat");
		
		
		additems.add(item1, 612.89);
		additems.add(item2, 1009.72);
		additems.add(item3, 890.00);
		additems.add(item4, 256.09);
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		LinkedHashMap<Integer,Double> itemscost = new LinkedHashMap<Integer,Double>() ;
		ArrayList<String> itemname=new ArrayList<String>();
		ArrayList<String> itemquantity=new ArrayList<String>();
		AddItems additems=new AddItems();
		Order order;
		add(additems);
		String s = "1";
		
		while(s!="0")
		{
			menu();
			 s=sc.next();
			 s= s.toLowerCase();
			switch(s)
			{
			case "big8": 
				itemname.add(s.toUpperCase());
				System.out.print("enter the quantity :");
				  order=new Order();
				  itemscost.putAll(order.order(s, sc.nextInt()));
				break;
				
			case "dipsbucket":
				itemname.add(s.toUpperCase());
				System.out.print("enter the quantity :");
				order=new Order();
				itemscost.putAll(order.order(s, sc.nextInt()));
				break;
			
			case "tripletreat"	:
				itemname.add(s.toUpperCase());
				System.out.print("enter the quantity :");
				order=new Order();
				itemscost.putAll(order.order(s, sc.nextInt()));
				break;
				
			case "minglesbucket" :
				itemname.add(s.toUpperCase());
				System.out.print("enter the quantity :");
				order=new Order();
				itemscost.putAll(order.order(s, sc.nextInt()));
				break;
				
			default :
				s="0";
			   break;
			      
			}
		}
		int i=0;
		System.out.println("==========Your Order===========");
		System.out.println("Id\tName\t \tPrice");
		for (Entry<Integer,Double> entry : itemscost.entrySet()) {
		       
	         
	        
	       System.out.println(entry.getKey()+"\t"+itemname.get(i)+"\t"+entry.getValue()); 
	       i++;
	        	 
	         }
		System.out.println("-----------------------------");
		System.out.print("Bill:\t\t\t");
		double sum = itemscost.values().stream().reduce(0.0, Double::sum);
		
		System.out.println(Math.round(sum * 100.0) / 100.0);
}
}
