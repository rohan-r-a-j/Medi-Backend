package com.emedical.springboot.emedical.dao;
/*
Code by Team A of Java3-
Rohan, Vidisha, Yash, Kunal, Shivam, Anmol
*/
import com.emedical.springboot.emedical.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RepositoryRestResource(collectionResourceRel = "productCategory", path= "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
