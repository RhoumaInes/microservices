package com.example.microservice.repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.microservice.entities.Publication;

@Repository
public interface PublicationRepo extends MongoRepository<Publication, String> {

}
