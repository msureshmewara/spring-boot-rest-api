package com.in.vegetablestore.model;

public class ProductCategory {
	private String cat_id;
	private String cat_name;
	private String cat_offer;
	private String cat_thum_url;
	/**
	 * @param cat_id
	 * @param cat_name
	 * @param cat_offer
	 * @param cat_thum_url
	 */
	public ProductCategory(String cat_id, String cat_name, String cat_offer, String cat_thum_url) {
		super();
		this.cat_id = cat_id;
		this.cat_name = cat_name;
		this.cat_offer = cat_offer;
		this.cat_thum_url = cat_thum_url;
	}
	/**
	 * @return the cat_id
	 */
	public String getCat_id() {
		return cat_id;
	}
	/**
	 * @param cat_id the cat_id to set
	 */
	public void setCat_id(String cat_id) {
		this.cat_id = cat_id;
	}
	/**
	 * @return the cat_name
	 */
	public String getCat_name() {
		return cat_name;
	}
	/**
	 * @param cat_name the cat_name to set
	 */
	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}
	/**
	 * @return the cat_offer
	 */
	public String getCat_offer() {
		return cat_offer;
	}
	/**
	 * @param cat_offer the cat_offer to set
	 */
	public void setCat_offer(String cat_offer) {
		this.cat_offer = cat_offer;
	}
	/**
	 * @return the cat_thum_url
	 */
	public String getCat_thum_url() {
		return cat_thum_url;
	}
	/**
	 * @param cat_thum_url the cat_thum_url to set
	 */
	public void setCat_thum_url(String cat_thum_url) {
		this.cat_thum_url = cat_thum_url;
	}
	
}
