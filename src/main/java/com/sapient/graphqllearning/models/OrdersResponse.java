package com.sapient.graphqllearning.models;

public class OrdersResponse {
	
	public int id;
	public String orderType;
	public boolean paymentStatus;
	public int price;
	
	
	public AccountDetails accountDetails;
	
	
	public OrdersResponse(int id, String orderType, boolean paymentStatus, int price) {
		super();
		this.id = id;
		this.orderType = orderType;
		this.paymentStatus = paymentStatus;
		this.price = price;
	}

	public OrdersResponse() {
		super();
		
	}
	
	public OrdersResponse(OrderDetails orderDetails) {
		this.id = orderDetails.getId();
		this.orderType = orderDetails.getOrderType();
		this.paymentStatus = orderDetails.paymentStatus;
		this.price = (int) orderDetails.getPrice();
	}
	
	
	
	public AccountDetails getAccountDetails() {
		return accountDetails;
	}

	public void setAccountDetails(AccountDetails accountDetails) {
		this.accountDetails = accountDetails;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
