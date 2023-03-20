package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.entity.Customer;
import com.example.repository.CustomerRepository;
import com.example.services.CustomerService;



@Repository
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer registerCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer viewCustomerProfile(String customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer editCustomerProfile(int customerId, Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer searchCustomerByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer searchCustomerByAadhaar(String customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer searchCustomerByMobile(String mobile) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> searchCustomerByName(String customerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer searchCustomerByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

}