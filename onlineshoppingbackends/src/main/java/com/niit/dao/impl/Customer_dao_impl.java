package com.niit.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.niit.dao.Customer_dao;
import com.niit.model.Customer;
 
@Repository
public class Customer_dao_impl implements Customer_dao {
 
    @Autowired
    private SessionFactory sessionFactory;
 
    public void addCustomer(Customer c) {
    	
        sessionFactory.getCurrentSession().saveOrUpdate(c);
 
    }
 
    @SuppressWarnings("unchecked")
    public List<Customer> getAllCustomer() {
 
        return sessionFactory.getCurrentSession().createQuery("from Customer").list();
    }
 
   @Override
    public void deleteCustomer(Customer c) {
            sessionFactory.getCurrentSession().delete(c);
       
 
    }
 
    public Customer getCustomer(Customer c) {
        return (c);
    }
 
    @Override
    public Customer updateCustomer(Customer c) {
        sessionFactory.getCurrentSession().update(c);
        return c;
    }
} 

