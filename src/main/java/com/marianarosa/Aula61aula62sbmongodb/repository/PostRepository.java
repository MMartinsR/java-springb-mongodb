package com.marianarosa.Aula61aula62sbmongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.marianarosa.Aula61aula62sbmongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
	
	// @Query
	@Query("{ 'title': { $regex: ?0, $options: 'i' } }")
	List<Post> searchTitle(String text);
	
	// Query methods
	// IgnoreCase, faz o método ignorar a diferença entre minusculas e maiusculas
	List<Post> findByTitleContainingIgnoreCase(String text);  

}
