package com.niit.dao;

import com.niit.model.Supplier;
import java.util.List;

public interface Supplier_dao {
 
    public void addSupplier(Supplier c);
 
    public List<Supplier> getAllSupplier();
 
    public void deleteSupplier(Supplier c);
 
    public Supplier updateSupplier(Supplier c);
 
    public Supplier getSupplier(Supplier c);
}

