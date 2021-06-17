package com.vm.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.vm.entity.Product;



public class ProductClient {
public static void main(String[] args) {
	

	
	Resource resource=new ClassPathResource("object.xml");
    BeanFactory factory=new XmlBeanFactory(resource);
    
   Product product=(Product)factory.getBean("p");
   System.out.println(product.toString());
   
   Product product2=(Product)factory.getBean("p2");
   System.out.println(product2.toString());
   
   Product product3=(Product)factory.getBean("p2");
   System.out.println(product3.toString());
}
}
