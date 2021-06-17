package com.vm.dao;

import org.springframework.stereotype.Component;

@Component
public class Mysql implements IDao {

	@Override
	public void dataBaseName() {
           System.out.println("this is mysql database");		
	}

	
}

