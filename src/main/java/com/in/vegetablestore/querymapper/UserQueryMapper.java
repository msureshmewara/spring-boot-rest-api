package com.in.vegetablestore.querymapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.in.vegetablestore.model.UserDetails;


public class UserQueryMapper implements RowMapper<UserDetails> {

	@Override
	public UserDetails mapRow(ResultSet rs, int rowNum) throws SQLException {

		UserDetails customer = new UserDetails(true, rs.getString("name"), rs.getString("user_name"), rs.getString("password"),
				rs.getString("email_id"), rs.getString("phone_number"));

		return customer;

	}
}
