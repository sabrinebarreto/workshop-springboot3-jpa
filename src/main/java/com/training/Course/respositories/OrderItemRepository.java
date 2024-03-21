package com.training.Course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.Course.entities.OrderItem;
import com.training.Course.entities.PK.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
