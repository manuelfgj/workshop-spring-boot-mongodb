package com.manuelfgj.whokshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.manuelfgj.whokshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
