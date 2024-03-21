package com.training.Course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.Course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
