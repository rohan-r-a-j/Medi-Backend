package com.emedical.springboot.emedical.service;

import com.emedical.springboot.emedical.dao.ProductRepository;
import com.emedical.springboot.emedical.entity.Product;
import com.emedical.springboot.emedical.entity.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
@Autowired
    private ProductRepository productRepository;

//get all products
@Override
public List<Product> getAllProducts(){
        return productRepository.findAll();
        }

// get product by category id
       @Override
    public Product findByCategoryId(Long id) throws ResourceNotFoundException {
       Product product = productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not exist with id :" + id));
        return product;
    }

    //create product by rest api

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
