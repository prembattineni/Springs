package com.vm.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.vm.entity.Helloworld;



public class AppClient {

	public static void main(String[] args) {
		
		Resource resource=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
        Helloworld helloworld=(Helloworld)factory.getBean("hello");
        helloworld.display();
	
	    
	}

}
