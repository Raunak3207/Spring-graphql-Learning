package com.sapient.graphqllearning.models;

public class OrderDetails {

	public int id;
	public String orderType;
	public boolean paymentStatus;
	public float price;

	public OrderDetails(int id, String orderType, boolean paymentStatus, int price) {
		super();
		this.id = id;
		this.orderType = orderType;
		this.paymentStatus = paymentStatus;
		this.price = price;
	}

	public OrderDetails() {
		super();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public boolean isPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
