package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pluralsight.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> custList = new ArrayList<>();

		Customer customer = new Customer();
		customer.setFirstName("James");
		customer.setLastName("Rodrigues");

		custList.add(customer);

		return custList;

	}
}
