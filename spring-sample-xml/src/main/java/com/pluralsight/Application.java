package com.pluralsight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		CustomerService service = context.getBean("customerService", CustomerServiceImpl.class);
		
		System.out.println(service);
		
		CustomerService service1 = context.getBean("customerService", CustomerServiceImpl.class);
		
		System.out.println(service1);

		System.out.println(service.findAll().get(0).getFirstName());

	}

}
