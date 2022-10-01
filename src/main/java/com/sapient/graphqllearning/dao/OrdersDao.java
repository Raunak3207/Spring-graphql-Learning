package com.sapient.graphqllearning.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sapient.graphqllearning.models.OrderDetails;

@Repository
public interface OrdersDao extends MongoRepository<OrderDetails, Integer> {

}
