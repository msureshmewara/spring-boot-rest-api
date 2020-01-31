package com.in.vegetablestore.querymapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.in.vegetablestore.model.ProductDetails;

public class ProductQueryMapper implements RowMapper<ProductDetails>{

	@Override
	public ProductDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		ProductDetails cart = new ProductDetails(rs.getString("id"),
				rs.getString("name"),
				rs.getString("price"),
				rs.getString("availablity"),
				rs.getString("category_id"),
				rs.getString("details"),
				rs.getString("discount"),
				rs.getString("thumb_url"),
				rs.getString("about"),
				rs.getString("benefits"),
				rs.getString("rating"),
				rs.getString("quantity"));
		return cart;
	}

}