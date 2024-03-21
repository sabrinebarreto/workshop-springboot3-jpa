package com.training.Course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.Course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
