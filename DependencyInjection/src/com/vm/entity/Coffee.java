package com.vm.entity;

public class Coffee implements IHotDrink {

	@Override
	public void prepare() {
		System.out.println("i am preparing coffee");
		
	}

//	void prepare()
//	{
//		System.out.println("i am preparing coffee");
//		System.out.println("cost of coffee is 20rs");
//	}
}
