package com.in.vegetablestore.model;

public class OrderStatus {
	
	private String order_id;
	private boolean order_status;
	private String message;
	private String order_date;
	private String delivery_date;
	
	
	/**
	 * @param order_id
	 * @param order_status
	 * @param message
	 * @param order_date
	 * @param delivery_date
	 */
	public OrderStatus(String order_id, boolean order_status, String message, String order_date, String delivery_date) {
		super();
		this.order_id = order_id;
		this.order_status = order_status;
		this.message = message;
		this.order_date = order_date;
		this.delivery_date = delivery_date;
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
	 * @return the order_status
	 */
	public boolean isOrder_status() {
		return order_status;
	}
	/**
	 * @param order_status the order_status to set
	 */
	public void setOrder_status(boolean order_status) {
		this.order_status = order_status;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the order_date
	 */
	public String getOrder_date() {
		return order_date;
	}
	/**
	 * @param order_date the order_date to set
	 */
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}
	/**
	 * @return the delivery_date
	 */
	public String getDelivery_date() {
		return delivery_date;
	}
	/**
	 * @param delivery_date the delivery_date to set
	 */
	public void setDelivery_date(String delivery_date) {
		this.delivery_date = delivery_date;
	}


}
