package com.marianarosa.Aula61aula62sbmongodb.repository;

import java.util.Date;
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
	
	// Pesquisa com vários critérios]}
	@Query("{ $and: [{date: {$gte: ?1}},{date: {$lte: ?2}},"
			+ "{ $or: [{ 'title': {$regex: ?0, $options: 'i'} }, "
			+ "{ 'body': { $regex: ?0, $options: 'i' } }, "
			+ "{ 'comments.text': { $regex: ?0, $options: 'i' } }]}] }")
	List<Post> fullSearch(String text, Date minDate, Date maxDate);

}
