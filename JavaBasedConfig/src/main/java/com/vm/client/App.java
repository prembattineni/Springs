package com.vm.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vm.config.MyAppConfig;
import com.vm.entity.Employee;

public class App {

	public static void main(String[] args) {
		
		//AnnotationConfigApplicationContext context=	new AnnotationConfigApplicationContext(MyAppConfig.class);
		         
		                //OR
		         //@Configuration above MyAppConfig class
		AnnotationConfigApplicationContext context=	new AnnotationConfigApplicationContext();

		context.scan("com.vm");
	    context.refresh();
		
		Employee emp=(Employee)context.getBean("e1");
	    System.out.println(emp.getName());
	    System.out.println(emp.getId());
	}
}
