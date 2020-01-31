package com.in.vegetablestore.model;

public class UserDetails {
	private boolean status;
	private String name;
	private String user_name;
	private String password;
	
	private String email;
	private String phone_number;
	
	
	/**
	 * @param status
	 * @param name
	 * @param user_name
	 * @param password
	 * @param email
	 * @param phone_number
	 */
	public UserDetails(boolean status, String name, String user_name, String password, String email,
			String phone_number) {
		super();
		this.status = status;
		this.name = name;
		this.user_name = user_name;
		this.password = password;
		this.email = email;
		this.phone_number = phone_number;
	}
	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the user_name
	 */
	public String getUser_name() {
		return user_name;
	}
	/**
	 * @param user_name the user_name to set
	 */
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the phone_number
	 */
	public String getPhone_number() {
		return phone_number;
	}
	/**
	 * @param phone_number the phone_number to set
	 */
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	

	
}
