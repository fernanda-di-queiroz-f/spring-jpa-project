package com.fpackage.spjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpackage.spjpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
