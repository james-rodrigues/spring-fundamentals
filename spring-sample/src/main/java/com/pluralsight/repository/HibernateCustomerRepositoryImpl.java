package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	/* (non-Javadoc)
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