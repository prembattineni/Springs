package com.vm.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vm.service.DataBaseService;

public class App {

	public static void main(String[] args) {        //AnnotaionBased Spring Application

		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(); 
	    context.scan("com.vm");
	    context.refresh();
	    
	    DataBaseService  dataBaseService = (DataBaseService)context.getBean("dataBaseService");
	    dataBaseService.displayDbInfo();
	}

}
