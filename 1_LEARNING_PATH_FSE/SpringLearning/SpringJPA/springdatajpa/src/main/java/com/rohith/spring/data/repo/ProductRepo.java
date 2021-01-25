package com.rohith.spring.data.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rohith.spring.data.entities.Product;

public interface ProductRepo extends CrudRepository<Product, Integer> {
	List<Product> findByName(String name);

	List<Product> findByNameAndPrice(String name, int price);
}
