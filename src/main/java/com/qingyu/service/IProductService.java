package com.qingyu.service;

import java.util.List;

import com.qingyu.model.Product;

public interface IProductService {  
    public Product getProductById(int id); 
    
    public List<Product> getProductIndex(Product record);
}  