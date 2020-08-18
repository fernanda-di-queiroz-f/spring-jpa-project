package com.fpackage.spjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpackage.spjpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
