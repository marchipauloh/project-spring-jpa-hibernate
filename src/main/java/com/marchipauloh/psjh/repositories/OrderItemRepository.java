package com.marchipauloh.psjh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marchipauloh.psjh.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
