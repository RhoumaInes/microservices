package com.example.microservice.control;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservice.entities.Commentaire;
import com.example.microservice.entities.Publication;
import com.example.microservice.service.CommentaireService;
import com.example.microservice.service.PublicationService;

@RestController
@RequestMapping("/pubs")
public class PublicationController {
	
	@Autowired
	PublicationService publicationService;
	@Autowired
	CommentaireService commentaireService;
	
	@PostMapping("/add-pub")
	@ResponseBody
	public Publication addPub(@RequestBody Publication pub)
	{
		pub.setDatepub(new Date());
		return publicationService.addPublication(pub);
	}
	
	
	@PutMapping("/edit-pub")
	@ResponseBody
	public Publication editPub(@RequestBody Publication pub)
	{
		return publicationService.addPublication(pub);
	}
	
	@GetMapping("/les-pubs")
	@ResponseBody
	public List<Publication> allPubs() {
		return publicationService.allPublication();
	}
	
	
	@PostMapping("/add-comm/{idPub}")
	@ResponseBody
	public Commentaire addPub(@PathVariable String idPub, @RequestBody Commentaire comm)
	{
		return commentaireService.addCommentaire(comm,idPub);
	}
	
	@GetMapping("/list-comm/{idPub}")
	@ResponseBody
	public List<Commentaire> allComments(@PathVariable String idPub) {
		System.out.println("OK");
		//return null;
		return commentaireService.showCommentPub(idPub);
	}
	
	@DeleteMapping("/delete-pub/{idPub}")
	@ResponseBody
	public void deletePub(@PathVariable String idPub) {
		publicationService.deletePub(idPub);
	}

}
