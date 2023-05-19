package com.emedical.springboot.emedical.dao;
/*
Code by Team A of Java3-
Rohan, Vidisha, Yash, Kunal, Shivam, Anmol
*/
import com.emedical.springboot.emedical.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {

//Page<Product> findByCategoryId(@RequestParam("id") Long id, Pageable pageable);


}
