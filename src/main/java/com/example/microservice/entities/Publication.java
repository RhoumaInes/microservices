package com.example.microservice.entities;

import java.util.Date;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Document(collection = "publication")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Publication {
	
	@Id
	private String id;	
	private String description;
	private Date datepub;

}
