package com.rohith.spring.data;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.rohith.spring.data.entities.Product;
import com.rohith.spring.data.repo.ProductRepo;

@SpringBootTest
class SpringdatajpaApplicationTests {
	@Autowired
	ApplicationContext context;

	@Test
	public void saveProduct() {
		
		// insert
		ProductRepo repo = context.getBean(ProductRepo.class);
		Product product = new Product();
		product.setId(1);
		product.setName("Rohith");
		product.setDescription("Iam");
		product.setPrice(100);
//		repo.save(product);
//		
//		// read
//		Optional<Product> productOptional = repo.findById(1);
//		System.out.println(productOptional);
//		
//		// update - new update from spring 2.x
//		if (productOptional.isPresent()) {
//			product = productOptional.get();
//			product.setPrice(101);
//			repo.save(product);
//		}
//		
//		// readAll
//		repo.findAll().forEach(p -> {System.out.println(p.getPrice());});
		
		// custom finders
		System.out.println(repo.findByName("Rohith"));
		
		// multiple finders
		System.out.println(repo.findByNameAndPrice("Rohith", 101));
		
		
	}

}
