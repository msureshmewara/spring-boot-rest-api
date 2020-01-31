package com.in.vegetablestore.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.in.vegetablestore.model.ProductDetails;
import com.in.vegetablestore.querymapper.ProductQueryMapper;

@Service
public class ProductService {

	public List<ProductDetails> getProductByCategory(String cat_id, JdbcTemplate jdbc) {
		String pro_cat_sql = "SELECT * from product_details where category_id = ?";
		List<ProductDetails> catList = new ArrayList<ProductDetails>();
		catList = jdbc.query(pro_cat_sql,  new Object[] {cat_id },  new ProductQueryMapper());
		return catList;
	}
}
