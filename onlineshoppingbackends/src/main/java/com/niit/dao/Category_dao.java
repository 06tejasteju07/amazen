package com.niit.dao;

import com.niit.model.Category;

import java.util.List;
 
public interface Category_dao {
 
    public void addCategory(Category c);
 
    public List<Category> getAllCategory();
 
    public void deleteCategory(Category c);
 
    public Category updateCategory(Category c);
 
    public Category getCategory(Category c);
}