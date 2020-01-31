package com.in.vegetablestore.querymapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.in.vegetablestore.model.ProductCategory;

public class ProductCategoryMapper implements RowMapper<ProductCategory>{

	@Override
	public ProductCategory mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		ProductCategory cart = new ProductCategory(rs.getString("cat_id"),
				rs.getString("cat_name"),
				rs.getString("cat_offer"),
				rs.getString("cat_thum_url"));
		return cart;
	}

}