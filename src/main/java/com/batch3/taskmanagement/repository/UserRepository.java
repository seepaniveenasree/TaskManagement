package com.batch3.taskmanagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.batch3.taskmanagement.model.User;

public interface UserRepository extends MongoRepository<User, String>{
	
    User findByEmail(String email);

}
