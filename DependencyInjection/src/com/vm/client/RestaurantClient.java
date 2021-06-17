package com.vm.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.vm.entity.Restaurant;

public class RestaurantClient {
public static void main(String[] args) {
	

	
	Resource resource=new ClassPathResource("object.xml");
    BeanFactory factory=new XmlBeanFactory(resource);
    Restaurant restaurant=(Restaurant)factory.getBean("res");
    restaurant.displayReataurantDetails();
}
}
