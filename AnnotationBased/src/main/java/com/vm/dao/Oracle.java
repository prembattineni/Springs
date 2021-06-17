package com.vm.dao;

import org.springframework.stereotype.Component;

@Component           //it will create object
public class Oracle implements IDao {

	@Override
	public void dataBaseName() {
		System.out.println("This is Oracle database");

	}

}
