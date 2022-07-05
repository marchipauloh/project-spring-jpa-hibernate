package com.marchipauloh.psjh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marchipauloh.psjh.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
