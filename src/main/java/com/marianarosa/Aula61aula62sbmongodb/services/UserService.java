package com.marianarosa.Aula61aula62sbmongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marianarosa.Aula61aula62sbmongodb.domain.User;
import com.marianarosa.Aula61aula62sbmongodb.repository.UserRepository;
import com.marianarosa.Aula61aula62sbmongodb.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(String id){
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado."));
	}

}
