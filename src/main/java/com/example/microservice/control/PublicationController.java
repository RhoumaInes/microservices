package com.example.microservice.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservice.entities.Publication;
import com.example.microservice.service.PublicationService;

@RestController
@RequestMapping("/pubs")
public class PublicationController {
	
	@Autowired
	PublicationService publicationService;
	
	@PostMapping("/add-pub")
	@ResponseBody
	public Publication addPub(@RequestBody Publication pub)
	{
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

}
