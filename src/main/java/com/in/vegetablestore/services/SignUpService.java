package com.in.vegetablestore.services;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.in.vegetablestore.model.UserDetails;
import com.in.vegetablestore.utils.Utils;

@Service
public class SignUpService {

	public UserDetails signUp(UserDetails userdetails, JdbcTemplate jdbc) {
		int status = 0;
		
		try {
			
			String sql = "INSERT INTO user_login(id, user_name, password, name, email_id, phone_number) VALUES (?, ?, ?, ?, ?, ?)";
				 status = jdbc.update(sql, new Object[] {Utils.getUniqueId(), userdetails.getUser_name(),
						userdetails.getPassword(), userdetails.getName(), userdetails.getEmail(), userdetails.getPhone_number()});
			} catch (Exception e) {
				// TODO: handle exception
				userdetails = new UserDetails(false, null, null, null, null, null);
			}
		if (status == 1) {
			userdetails = new UserDetails(true, null, null, null, null, null);
		} else {
			userdetails = new UserDetails(false, null, null, null, null, null);
		}
		return userdetails;
	}
}
