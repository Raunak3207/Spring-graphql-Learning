package com.sapient.graphqllearning.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import com.sapient.graphqllearning.dao.AccountDetailsDao;
import com.sapient.graphqllearning.dao.OrdersDao;
import com.sapient.graphqllearning.models.AccountDetails;
import com.sapient.graphqllearning.models.OrderDetails;
import com.sapient.graphqllearning.models.OrdersResponse;

@Controller
public class Query {

	
	@Autowired
	OrdersDao ordersDao;
	
	@Autowired
	AccountDetailsDao accountDetailsDao;
	
	@QueryMapping
	public String student() {
		return "Hello GraphQL";
	}
	
	@QueryMapping
	public OrdersResponse getOrders(@Argument int  id) {
		return new OrdersResponse(ordersDao.findById(id).get());
	}
	
	
	@SchemaMapping
	public AccountDetails accountDetails(OrdersResponse ordersResponse) {
		AccountDetails accountDetails  = accountDetailsDao.findById(ordersResponse.getId()).get();
		return accountDetails;
	}
	
	@MutationMapping
	public boolean addOrder(@Argument OrderDetails orderDetails,@Argument int id) {
		try{
			ordersDao.save(orderDetails);
		}catch (Exception e) {
			return false;
		}
		
		return true;
	}
}
