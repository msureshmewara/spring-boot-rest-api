package com.in.vegetablestore.model;

public class OrderProductDetails {
	private String order_id;
	private String user_id;
	private String pro_name;
	private String pro_price;
	private String pro_cat_id;
	private String pro_discount;
	private String pro_thumb_url;
	private String pro_rating;
	private String pro_quantity;
	/**
	 * @param order_id
	 * @param user_id
	 * @param pro_name
	 * @param pro_price
	 * @param pro_cat_id
	 * @param pro_discount
	 * @param pro_thumb_url
	 * @param pro_rating
	 * @param pro_quantity
	 */
	public OrderProductDetails(String order_id, String user_id, String pro_name, String pro_price, String pro_cat_id,
			String pro_discount, String pro_thumb_url, String pro_rating, String pro_quantity) {
		super();
		this.order_id = order_id;
		this.user_id = user_id;
		this.pro_name = pro_name;
		this.pro_price = pro_price;
		this.pro_cat_id = pro_cat_id;
		this.pro_discount = pro_discount;
		this.pro_thumb_url = pro_thumb_url;
		this.pro_rating = pro_rating;
		this.pro_quantity = pro_quantity;
	}
	/**
	 * @return the order_id
	 */
	public String getOrder_id() {
		return order_id;
	}
	/**
	 * @param order_id the order_id to set
	 */
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
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
	 * @return the pro_name
	 */
	public String getPro_name() {
		return pro_name;
	}
	/**
	 * @param pro_name the pro_name to set
	 */
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	/**
	 * @return the pro_price
	 */
	public String getPro_price() {
		return pro_price;
	}
	/**
	 * @param pro_price the pro_price to set
	 */
	public void setPro_price(String pro_price) {
		this.pro_price = pro_price;
	}
	/**
	 * @return the pro_cat_id
	 */
	public String getPro_cat_id() {
		return pro_cat_id;
	}
	/**
	 * @param pro_cat_id the pro_cat_id to set
	 */
	public void setPro_cat_id(String pro_cat_id) {
		this.pro_cat_id = pro_cat_id;
	}
	/**
	 * @return the pro_discount
	 */
	public String getPro_discount() {
		return pro_discount;
	}
	/**
	 * @param pro_discount the pro_discount to set
	 */
	public void setPro_discount(String pro_discount) {
		this.pro_discount = pro_discount;
	}
	/**
	 * @return the pro_thumb_url
	 */
	public String getPro_thumb_url() {
		return pro_thumb_url;
	}
	/**
	 * @param pro_thumb_url the pro_thumb_url to set
	 */
	public void setPro_thumb_url(String pro_thumb_url) {
		this.pro_thumb_url = pro_thumb_url;
	}
	/**
	 * @return the pro_rating
	 */
	public String getPro_rating() {
		return pro_rating;
	}
	/**
	 * @param pro_rating the pro_rating to set
	 */
	public void setPro_rating(String pro_rating) {
		this.pro_rating = pro_rating;
	}
	/**
	 * @return the pro_quantity
	 */
	public String getPro_quantity() {
		return pro_quantity;
	}
	/**
	 * @param pro_quantity the pro_quantity to set
	 */
	public void setPro_quantity(String pro_quantity) {
		this.pro_quantity = pro_quantity;
	}
	
	
}
