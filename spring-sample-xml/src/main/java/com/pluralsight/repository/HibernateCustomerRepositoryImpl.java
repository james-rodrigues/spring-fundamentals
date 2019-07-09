package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.pluralsight.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${dbUsername}")
	private String dbUsername;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pluralsight.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		System.out.println(dbUsername);

		List<Customer> custList = new ArrayList<>();

		Customer customer = new Customer();
		customer.setFirstName("James");
		customer.setLastName("Rodrigues");

		custList.add(customer);

		return custList;

	}

	/* For XMl Config only
	 * 
	 * public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}*/
}
