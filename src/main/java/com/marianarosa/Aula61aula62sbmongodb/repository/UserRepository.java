package com.marianarosa.Aula61aula62sbmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.marianarosa.Aula61aula62sbmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
	

}
