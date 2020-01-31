package com.in.vegetablestore.model;

public class UserCartDetails {
	private String prod_id;
	private String prod_cat_id;
	private String prod_qty;
	private String prod_name;
	private String prod_price;
	private String prod_availablity;
	private String prod_discount;
	private String prod_thumb_url;
	private String prod_rating;
	/**
	 * @param prod_id
	 * @param prod_cat_id
	 * @param prod_qty
	 * @param prod_name
	 * @param prod_price
	 * @param prod_availablity
	 * @param prod_discount
	 * @param prod_thumb_url
	 * @param prod_rating
	 */
	public UserCartDetails(String prod_id, String prod_cat_id, String prod_qty, String prod_name, String prod_price,
			String prod_availablity, String prod_discount, String prod_thumb_url, String prod_rating) {
		super();
		this.prod_id = prod_id;
		this.prod_cat_id = prod_cat_id;
		this.prod_qty = prod_qty;
		this.prod_name = prod_name;
		this.prod_price = prod_price;
		this.prod_availablity = prod_availablity;
		this.prod_discount = prod_discount;
		this.prod_thumb_url = prod_thumb_url;
		this.prod_rating = prod_rating;
	}
	/**
	 * @return the prod_id
	 */
	public String getProd_id() {
		return prod_id;
	}
	/**
	 * @param prod_id the prod_id to set
	 */
	public void setProd_id(String prod_id) {
		this.prod_id = prod_id;
	}
	/**
	 * @return the prod_cat_id
	 */
	public String getProd_cat_id() {
		return prod_cat_id;
	}
	/**
	 * @param prod_cat_id the prod_cat_id to set
	 */
	public void setProd_cat_id(String prod_cat_id) {
		this.prod_cat_id = prod_cat_id;
	}
	/**
	 * @return the prod_qty
	 */
	public String getProd_qty() {
		return prod_qty;
	}
	/**
	 * @param prod_qty the prod_qty to set
	 */
	public void setProd_qty(String prod_qty) {
		this.prod_qty = prod_qty;
	}
	/**
	 * @return the prod_name
	 */
	public String getProd_name() {
		return prod_name;
	}
	/**
	 * @param prod_name the prod_name to set
	 */
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	/**
	 * @return the prod_price
	 */
	public String getProd_price() {
		return prod_price;
	}
	/**
	 * @param prod_price the prod_price to set
	 */
	public void setProd_price(String prod_price) {
		this.prod_price = prod_price;
	}
	/**
	 * @return the prod_availablity
	 */
	public String getProd_availablity() {
		return prod_availablity;
	}
	/**
	 * @param prod_availablity the prod_availablity to set
	 */
	public void setProd_availablity(String prod_availablity) {
		this.prod_availablity = prod_availablity;
	}
	/**
	 * @return the prod_discount
	 */
	public String getProd_discount() {
		return prod_discount;
	}
	/**
	 * @param prod_discount the prod_discount to set
	 */
	public void setProd_discount(String prod_discount) {
		this.prod_discount = prod_discount;
	}
	/**
	 * @return the prod_thumb_url
	 */
	public String getProd_thumb_url() {
		return prod_thumb_url;
	}
	/**
	 * @param prod_thumb_url the prod_thumb_url to set
	 */
	public void setProd_thumb_url(String prod_thumb_url) {
		this.prod_thumb_url = prod_thumb_url;
	}
	/**
	 * @return the prod_rating
	 */
	public String getProd_rating() {
		return prod_rating;
	}
	/**
	 * @param prod_rating the prod_rating to set
	 */
	public void setProd_rating(String prod_rating) {
		this.prod_rating = prod_rating;
	}
	
	
}
