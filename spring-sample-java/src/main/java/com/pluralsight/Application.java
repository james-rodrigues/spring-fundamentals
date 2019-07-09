package com.pluralsight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pluralsight.config.AppConfig;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		CustomerService service = context.getBean("customerService", CustomerServiceImpl.class);

		System.out.println(service);

		CustomerService service2 = context.getBean("customerService", CustomerServiceImpl.class);

		System.out.println(service2);

		System.out.println(service.findAll().get(0).getFirstName());

	}

}
