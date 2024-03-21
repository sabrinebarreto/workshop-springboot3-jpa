package com.training.Course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.Course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
