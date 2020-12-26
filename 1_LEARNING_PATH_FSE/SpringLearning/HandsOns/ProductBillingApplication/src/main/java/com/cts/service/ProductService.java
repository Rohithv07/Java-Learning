package com.cts.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.bean.Product;
import com.cts.dao.ProductDao;
import com.cts.dao.ProductDaoImpl;

@Service
public class ProductService {
	
	//wire dependency
	@Autowired
	
	private ProductDao productDao;

	public Product getProductDetails(int product_code) {
		//add your code here
		return productDao.getProductDetails(product_code);
	}
	
	public double calculatePrice(int quantity,double product_price) {
		//add your code here
		double price = (double) quantity * product_price;
		return price;
	}
	
	public boolean validateProductCode(int product_code){
		//add your code here
		return product_code > 999 && product_code <= 9999;
	}
	
	public boolean validateQuantity(int quantity){
		//add your code here
		return quantity > 0;
	}
	
	public ProductDao getProductDao() {
		return productDao;
	}
	
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
}
