package com.vm.entity;

public class Tea implements IHotDrink{

	@Override
	public void prepare() {
		System.out.println("i am preparing tea");
	}

//	void prepare()
//	{
//		System.out.println("i am preparing tea");
//		System.out.println("cost of tea is 10rs");
//	}
	
	
}
