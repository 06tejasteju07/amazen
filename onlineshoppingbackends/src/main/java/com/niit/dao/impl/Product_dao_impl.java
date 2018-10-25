package com.niit.dao.impl;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.niit.dao.Product_dao;
import com.niit.model.Product;
 


	@Repository
	public class Product_dao_impl implements Product_dao {
	 
	    @Autowired
	    private SessionFactory sessionFactory;
	 
	    public void addProduct(Product c) {
	    	
	        sessionFactory.getCurrentSession().saveOrUpdate(c);
	 
	    }
	 
	    @SuppressWarnings("unchecked")
	    public List<Product> getAllProduct() {
	 
	        return sessionFactory.getCurrentSession().createQuery("from Product").list();
	    }
	 
	   @Override
	    public void deleteProduct(Product c) {
	            sessionFactory.getCurrentSession().delete(c);
	       
	 
	    }
	 
	    public Product getProduct(Product c) {
	        return (c);
	    }
	 
	    @Override
	    public Product updateProduct(Product c) {
	        sessionFactory.getCurrentSession().update(c);
	        return c;
	    }
	} 


