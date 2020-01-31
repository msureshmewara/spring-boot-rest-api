package com.in.vegetablestore.model;

import java.util.ArrayList;

public class NewOrder {

	private String user_id;
	private String amount;
	private String ttl_product;
	private ArrayList<OrderProductDetails> order_pro_details;
	/**
	 * @param user_id
	 * @param amount
	 * @param ttl_product
	 * @param order_pro_details
	 */
	public NewOrder(String user_id, String amount, String ttl_product,
			ArrayList<OrderProductDetails> order_pro_details) {
		super();
		this.user_id = user_id;
		this.amount = amount;
		this.ttl_product = ttl_product;
		this.order_pro_details = order_pro_details;
	}
	/**
	 * @return the user_id
	 */
	public String getUser_id() {
		return user_id;
	}
	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}
	/**
	 * @return the ttl_product
	 */
	public String getTtl_product() {
		return ttl_product;
	}
	/**
	 * @param ttl_product the ttl_product to set
	 */
	public void setTtl_product(String ttl_product) {
		this.ttl_product = ttl_product;
	}
	/**
	 * @return the order_pro_details
	 */
	public ArrayList<OrderProductDetails> getOrder_pro_details() {
		return order_pro_details;
	}
	/**
	 * @param order_pro_details the order_pro_details to set
	 */
	public void setOrder_pro_details(ArrayList<OrderProductDetails> order_pro_details) {
		this.order_pro_details = order_pro_details;
	}
	
	
}
