package com.marchipauloh.psjh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marchipauloh.psjh.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
