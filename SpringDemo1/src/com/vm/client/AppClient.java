package com.vm.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.vm.college.College;
import com.vm.entity.Employee;
import com.vm.entity.Product;

public class AppClient {

	public static void main(String[] args) {
		
		Resource resource=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
        Employee employee=(Employee)factory.getBean("emp");
	    employee.display();
	
	    Product product=(Product)factory.getBean("p");
	
	    System.out.println(product.toString());
	    
	    
		Resource resource1=new ClassPathResource("applicationContextCollege.xml");
		BeanFactory factory1=new XmlBeanFactory(resource1);
	   College college=(College)factory1.getBean("coll");
	   System.out.println(college.toString());
	}

}
