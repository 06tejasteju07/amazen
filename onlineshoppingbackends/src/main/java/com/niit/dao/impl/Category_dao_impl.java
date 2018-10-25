package com.niit.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.niit.dao.Category_dao;
import com.niit.model.Category;
 
@Repository
public class Category_dao_impl implements Category_dao {
 
    @Autowired
    private SessionFactory sessionFactory;
 
    public void addCategory(Category c) {
    	
        sessionFactory.getCurrentSession().saveOrUpdate(c);
 
    }
 
    @SuppressWarnings("unchecked")
    public List<Category> getAllCategory() {
 
        return sessionFactory.getCurrentSession().createQuery("from Category").list();
    }
 
   @Override
    public void deleteCategory(Category c) {
            sessionFactory.getCurrentSession().delete(c);
       
 
    }
 
    public Category getCategory(Category c) {
        return (c);
    }
 
    @Override
    public Category updateCategory(Category c) {
        sessionFactory.getCurrentSession().update(c);
        return c;
    } 
}
