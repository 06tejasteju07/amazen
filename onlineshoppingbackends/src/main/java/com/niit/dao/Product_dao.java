package com.niit.dao;

import com.niit.model.Product;
import java.util.List;

public interface Product_dao {
 
    public void addProduct(Product c);
 
    public List<Product> getAllProduct();
 
    public void deleteProduct(Product c);
 
    public Product updateProduct(Product c);
 
    public Product getProduct(Product c);
}