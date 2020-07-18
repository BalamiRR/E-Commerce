package com.fuatkara.ecommerce.dao;

import com.fuatkara.ecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin("http://localhost:4200")
// Accept calls from web browser scripts for this origin
public interface ProductRepository extends JpaRepository<Product, Long> {
    // <Product, Long>  <Class name and Primary Key type>
    Page<Product> findByCategoryId(@RequestParam("id") Long id, Pageable page);

    Page<Product> findByNameContaining(@RequestParam("name") String name, Pageable pageable);
}
