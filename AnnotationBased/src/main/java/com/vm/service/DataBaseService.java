package com.vm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.vm.dao.IDao;

@Component
public class DataBaseService {

	
	@Autowired  //from Mysql class mysql m small
	@Qualifier("mysql")  //if given oracle in place of mysql it will call Oracle
	IDao dao;

	public void setDao(IDao dao) {
		this.dao = dao;
	}
	
	public void displayDbInfo()
	{
		dao.dataBaseName();
	}
	
}
