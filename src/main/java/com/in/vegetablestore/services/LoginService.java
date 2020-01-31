package com.in.vegetablestore.services;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;


import com.in.vegetablestore.model.UserDetails;
import com.in.vegetablestore.querymapper.UserQueryMapper;

@Service
public class LoginService {

	public UserDetails login(String username, String password, JdbcTemplate jdbc) {
		UserDetails muserdetails = null;
		System.out.println(username + "<------>" +password);
		if((username != "") && (password != "")) {
			try {
				String sql = "SELECT * FROM user_login WHERE user_name = ? && password = ?";
				muserdetails = jdbc.queryForObject(sql, new Object[] { username, password }, new UserQueryMapper());
			} catch (Exception e) {
				// TODO: handle exception
				muserdetails = new UserDetails(false, null, null, null, null, null);
			}
		}
		return muserdetails;
	}

}
