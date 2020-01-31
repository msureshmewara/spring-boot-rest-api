package com.in.vegetablestore.model;

public class Cart {
	private String _id;
	private String user_id;
	private String product_id;
	private String product_category;
	private String product_quantity;
	/**
	 * @param _id
	 * @param user_id
	 * @param product_id
	 * @param product_category
	 * @param product_quantity
	 */
	public Cart(String _id, String user_id, String product_id, String product_category,
			String product_quantity) {
		super();
		this._id = _id;
		this.user_id = user_id;
		this.product_id = product_id;
		this.product_category = product_category;
		this.product_quantity = product_quantity;
	}
	/**
	 * @return the _id
	 */
	public String get_id() {
		return _id;
	}
	/**
	 * @param _id the _id to set
	 */
	public void set_id(String _id) {
		this._id = _id;
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
	 * @return the product_id
	 */
	public String getProduct_id() {
		return product_id;
	}
	/**
	 * @param product_id the product_id to set
	 */
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	/**
	 * @return the product_category
	 */
	public String getProduct_category() {
		return product_category;
	}
	/**
	 * @param product_category the product_category to set
	 */
	public void setProduct_category(String product_category) {
		this.product_category = product_category;
	}
	/**
	 * @return the product_quantity
	 */
	public String getProduct_quantity() {
		return product_quantity;
	}
	/**
	 * @param product_quantity the product_quantity to set
	 */
	public void setProduct_quantity(String product_quantity) {
		this.product_quantity = product_quantity;
	}
	
	
	
}
