package com.example.mongodb.respository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongodb.model.Customer;

public interface CustomerRespository extends MongoRepository<Customer, String>{

}
