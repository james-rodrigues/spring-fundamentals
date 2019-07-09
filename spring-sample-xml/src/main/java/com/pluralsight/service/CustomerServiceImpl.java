package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository repo;

	public CustomerServiceImpl() {
	}

	public CustomerServiceImpl(CustomerRepository repo) {
		this.repo = repo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pluralsight.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return repo.findAll();
	}

	public void setRepo(CustomerRepository repo) {
		this.repo = repo;
	}
}
