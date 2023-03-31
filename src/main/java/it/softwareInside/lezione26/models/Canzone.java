package it.softwareInside.lezione26.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Canzone {

	
	@Id
	private String titolo;
	
	private String genere;
	
	private double durata;
	
}
