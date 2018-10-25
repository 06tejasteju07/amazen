package com.niit.dao;

import com.niit.model.Customer;
import java.util.List;

public interface Customer_dao {
 
    public void addCustomer(Customer c);
 
    public List<Customer> getAllCustomer();
 
    public void deleteCustomer(Customer c);
 
    public Customer updateCustomer(Customer c);
 
    public Customer getCustomer(Customer c);
}