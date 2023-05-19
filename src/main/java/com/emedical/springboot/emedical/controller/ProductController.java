package com.emedical.springboot.emedical.controller;
/*
Code by Team A of Java3-
Rohan, Vidisha, Yash, Kunal, Shivam, Anmol
*/

import com.emedical.springboot.emedical.entity.Product;
import com.emedical.springboot.emedical.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin()
@RestController
@RequestMapping("/api/")
public class ProductController {
    @Autowired
    private ProductService productService;

    //get all products
    @GetMapping("/products")
    public ResponseEntity<?> getAllProducts(){
        return new ResponseEntity(productService.getAllProducts(), HttpStatus.ACCEPTED);
    }
//get product by category id
@GetMapping("/category/{id}/**")
    public ResponseEntity<?> findByCategoryId(@RequestParam("id") Long id){
        return  new ResponseEntity(productService.findByCategoryId(id), HttpStatus.ACCEPTED);
}

//create product
    @PostMapping("/products")
    public ResponseEntity<?> createProduct(@RequestParam Product product){
        return new ResponseEntity(productService.createProduct(product), HttpStatus.ACCEPTED);
    }
}
/*
Code by Team A of Java3-
Rohan, Vidisha, Yash, Kunal, Shivam, Anmol
*/