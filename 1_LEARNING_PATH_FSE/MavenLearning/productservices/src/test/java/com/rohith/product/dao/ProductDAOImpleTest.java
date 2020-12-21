package com.rohith.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.rohith.product.dto.Product;

public class ProductDAOImpleTest {

	@Test
	public void createShouldCreateProduct() {
		ProductDAO dao = new ProductDAOImple();
		Product product = new Product();
		product.setId(1);
		product.setName("AAAA");
		product.setDescription("Good");
		product.setPrice(800);
		dao.create(product);
		Product result = dao.read(1);
		assertNotNull(result);
		assertEquals("AAAA", result.getName());
	}

}
// to skip the test in command line - mvn install -DskipTests
// to skip the test in eclipse, right click on project, run as, run configurations, maven build, new, give configuration a name, specify the goal, check on skip tests 