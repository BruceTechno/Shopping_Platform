package com.example.shopping_platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shopping_platform.entity.Order;

public interface OrderDao extends JpaRepository<Order, Integer> {

	
}
