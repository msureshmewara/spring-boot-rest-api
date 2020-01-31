package com.in.vegetablestore.model;

public class ProductDetails {
	private String id;
	private String name;
	private String price;
	private String availablity;
	private String category_id;
	private String details;
	private String discount;
	private String thumb_url;
	private String about;
	private String benefits;
	private String rating;
	private String quantity;
	/**
	 * @param id
	 * @param name
	 * @param price
	 * @param availablity
	 * @param category_id
	 * @param details
	 * @param discount
	 * @param thumb_url
	 * @param about
	 * @param benefits
	 * @param rating
	 * @param quantity
	 */
	public ProductDetails(String id, String name, String price, String availablity, String category_id, String details,
			String discount, String thumb_url, String about, String benefits, String rating, String quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.availablity = availablity;
		this.category_id = category_id;
		this.details = details;
		this.discount = discount;
		this.thumb_url = thumb_url;
		this.about = about;
		this.benefits = benefits;
		this.rating = rating;
		this.quantity = quantity;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
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
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	/**
	 * @return the availablity
	 */
	public String getAvailablity() {
		return availablity;
	}
	/**
	 * @param availablity the availablity to set
	 */
	public void setAvailablity(String availablity) {
		this.availablity = availablity;
	}
	/**
	 * @return the category_id
	 */
	public String getCategory_id() {
		return category_id;
	}
	/**
	 * @param category_id the category_id to set
	 */
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}
	/**
	 * @return the details
	 */
	public String getDetails() {
		return details;
	}
	/**
	 * @param details the details to set
	 */
	public void setDetails(String details) {
		this.details = details;
	}
	/**
	 * @return the discount
	 */
	public String getDiscount() {
		return discount;
	}
	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	/**
	 * @return the thumb_url
	 */
	public String getThumb_url() {
		return thumb_url;
	}
	/**
	 * @param thumb_url the thumb_url to set
	 */
	public void setThumb_url(String thumb_url) {
		this.thumb_url = thumb_url;
	}
	/**
	 * @return the about
	 */
	public String getAbout() {
		return about;
	}
	/**
	 * @param about the about to set
	 */
	public void setAbout(String about) {
		this.about = about;
	}
	/**
	 * @return the benefits
	 */
	public String getBenefits() {
		return benefits;
	}
	/**
	 * @param benefits the benefits to set
	 */
	public void setBenefits(String benefits) {
		this.benefits = benefits;
	}
	/**
	 * @return the rating
	 */
	public String getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(String rating) {
		this.rating = rating;
	}
	/**
	 * @return the quantity
	 */
	public String getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	
	
}
