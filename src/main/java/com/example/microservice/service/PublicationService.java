package com.example.microservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.microservice.entities.Publication;
import com.example.microservice.repos.PublicationRepo;

@Service
public class PublicationService {
	@Autowired
	PublicationRepo publicationRepo;
	
	public Publication addPublication(Publication pub) {
		return publicationRepo.save(pub);
	}	
	
	public List<Publication> allPublication() {
		return publicationRepo.findAll();
	}

}
