package com.emedical.springboot.emedical.service;

import com.emedical.springboot.emedical.entity.Product;
import com.emedical.springboot.emedical.entity.ProductCategory;

import java.util.List;

public interface ProductService {

   //return list of products
    List<Product> getAllProducts();

//return by category id
    Product findByCategoryId(Long id);


    //create Product
    Product createProduct (Product product);
}

