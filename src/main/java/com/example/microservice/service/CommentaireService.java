package com.example.microservice.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.microservice.entities.Commentaire;
import com.example.microservice.entities.Publication;
import com.example.microservice.repos.CommentaireRepo;
import com.example.microservice.repos.PublicationRepo;

@Service
public class CommentaireService {
	
	@Autowired
	CommentaireRepo commentaireRepo;
	@Autowired
	PublicationRepo publicationRepo;
	
	public Commentaire addCommentaire(Commentaire c, String idPub) {
		c.setDateComm(new Date());
		c.setPublication(publicationRepo.findById(idPub).get());
		return commentaireRepo.save(c);
	}
	
	
	public List<Commentaire> showCommentPub(String idPub) {
		
		Publication p = publicationRepo.findById(idPub).get();
		
		return commentaireRepo.findByPublication(p);
		
	}
	
	
	public void deleteComment(String idComm) {
		commentaireRepo.delete(commentaireRepo.findById(idComm).get());
	}
	public void deleteByPub(String idPub) {
		Publication p = publicationRepo.findById(idPub).get();
		for(Commentaire com : commentaireRepo.findByPublication(p)) {
			commentaireRepo.delete(com);
		}
	}

}
