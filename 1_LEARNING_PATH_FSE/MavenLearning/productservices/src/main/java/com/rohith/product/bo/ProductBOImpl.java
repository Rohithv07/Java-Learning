package com.rohith.product.bo;

import com.rohith.product.dao.ProductDAO;
import com.rohith.product.dto.Product;

public class ProductBOImpl implements ProductBO {
	private ProductDAO dao;

	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {

		return dao.read(id);
	}

	public ProductDAO getDao() {
		return dao;
	}

	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}

}
