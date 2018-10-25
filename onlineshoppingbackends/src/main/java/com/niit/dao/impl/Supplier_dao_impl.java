package com.niit.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.niit.dao.Supplier_dao;
import com.niit.model.Supplier;
 
@Repository
public class Supplier_dao_impl implements Supplier_dao {
 
    @Autowired
    private SessionFactory sessionFactory;
 
    public void addSupplier(Supplier c) {
    	
        sessionFactory.getCurrentSession().saveOrUpdate(c);
 
    }
 
    @SuppressWarnings("unchecked")
    public List<Supplier> getAllSupplier() {
 
        return sessionFactory.getCurrentSession().createQuery("from Supplier").list();
    }
 
   @Override
    public void deleteSupplier(Supplier c) {
            sessionFactory.getCurrentSession().delete(c);
       
 
    }
 
    public Supplier getSupplier(Supplier c) {
        return (c);
    }
 
    @Override
    public Supplier updateSupplier(Supplier c) {
        sessionFactory.getCurrentSession().update(c);
        return c;
    }

	
}

