package com.vm.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.vm.entity.Customer;





public class ProductClient {
public static void main(String[] args) {
	

	
	Resource resource=new ClassPathResource("object.xml");
    BeanFactory factory=new XmlBeanFactory(resource);
    
    Customer customer=(Customer) factory.getBean("customer");
   customer.displayCustomerInfo();
   
}
}
