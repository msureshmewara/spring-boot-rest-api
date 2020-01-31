package com.in.vegetablestore.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.in.vegetablestore.model.ProductCategory;
import com.in.vegetablestore.querymapper.ProductCategoryMapper;

@Service
public class ProductCategoryService {

	public List<ProductCategory> getProductCategory(JdbcTemplate jdbc) {
		String pro_cat_sql = "SELECT * from product_category";
		List<ProductCategory> catList = new ArrayList<ProductCategory>();
		catList = jdbc.query(pro_cat_sql, new ProductCategoryMapper());
		return catList;
	}
}
