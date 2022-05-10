package com.marianarosa.Aula61aula62sbmongodb.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marianarosa.Aula61aula62sbmongodb.domain.Post;
import com.marianarosa.Aula61aula62sbmongodb.repository.PostRepository;
import com.marianarosa.Aula61aula62sbmongodb.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repository;

	public Post findById(String id){
		Optional<Post> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado."));
	}

}
