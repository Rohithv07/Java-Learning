package com.cts.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cts.bean.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	//wire dependency
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Product getProductDetails(int product_code) {
		String sql = "select * from product where product_code = ?";
		RowMapper<Product> p = (res, i) -> {
			Product p1 = new Product();
			p1.setProduct_code(res.getInt(1));
			p1.setProduct_name(res.getString(2));
			p1.setProduct_category(res.getString(3));
			p1.setProduct_desc(res.getString(4));
			p1.setProduct_price(res.getDouble(5));
			return p1;
		};
		return jdbcTemplate.queryForObject(sql, p, product_code);
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
