package com.example.microservice.repos;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.microservice.entities.Commentaire;
import com.example.microservice.entities.Publication;

@Repository
public interface CommentaireRepo extends MongoRepository<Commentaire, String> {
	
	@Query("{ 'publication' : ?0 }")
    List<Commentaire> findByPublication(Publication pub);

}
