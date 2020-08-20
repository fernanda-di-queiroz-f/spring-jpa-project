package com.fpackage.spjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpackage.spjpa.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
