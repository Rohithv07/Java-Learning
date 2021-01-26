package com.rohith.spring.data.entity.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rohith.spring.data.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
}
