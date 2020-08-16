package com.fpackage.spjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpackage.spjpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
