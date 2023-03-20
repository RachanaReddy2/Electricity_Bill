package com.example.services;

import java.util.List;

import com.example.entity.Customer;



public interface CustomerService {
 
	public Customer registerCustomer(Customer customer);
	
	public Customer viewCustomerProfile(String customerId);
	
	public Customer editCustomerProfile(int customerId,Customer customer); 
	
	public Customer searchCustomerByEmail(String email);
	
	public Customer searchCustomerByAadhaar(String customerId);
	
	public Customer searchCustomerByMobile(String mobile);
	
	public List<Customer> searchCustomerByName(String customerName);
	
	public Customer searchCustomerByCustomerId(int customerId);
}