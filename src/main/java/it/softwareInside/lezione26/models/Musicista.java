package it.softwareInside.lezione26.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Musicista {
	
	
	@Id
	private String cognome;
	
	private int eta;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Canzone> canzoni;
}
