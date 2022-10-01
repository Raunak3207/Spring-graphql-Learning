package com.sapient.graphqllearning.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sapient.graphqllearning.models.AccountDetails;


@Repository
public interface AccountDetailsDao extends MongoRepository<AccountDetails, Integer> {

}
