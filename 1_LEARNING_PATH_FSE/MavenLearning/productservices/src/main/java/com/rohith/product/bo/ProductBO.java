package com.rohith.product.bo;

import com.rohith.product.dto.Product;

public interface ProductBO {
	
	public void create(Product product);
	
	public Product findProduct(int id);

}
