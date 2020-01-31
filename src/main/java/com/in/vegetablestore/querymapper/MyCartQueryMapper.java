package com.in.vegetablestore.querymapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.in.vegetablestore.model.Cart;

public class MyCartQueryMapper implements RowMapper<Cart>{

	@Override
	public Cart mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Cart cart = new Cart(rs.getString("id"),
				rs.getString("user_id"),
				rs.getString("product_id"),
				rs.getString("product_category"),
				rs.getString("product_quantity"));

		return cart;
	}

}