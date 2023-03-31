package it.softwareInside.lezione26.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.softwareInside.lezione26.models.Musicista;
import it.softwareInside.lezione26.services.ServicesMusicista;

@RequestMapping("/api")
@RestController
public class RestControllerMusicista {

	
	@Autowired
	ServicesMusicista musicistaServices;
	
	@PostMapping("/add")
	public boolean addMusicista(@RequestBody Musicista musicista) {
		return musicistaServices.addMusicista(musicista);
	}
	
	@DeleteMapping("/delete")
	public boolean delete(String id) {
		return musicistaServices.delete(id);
	}
	
	@DeleteMapping("/deleteAll")
	public boolean deleteAll() {
		return musicistaServices.deleteAll();
	}
	@GetMapping("/get")
	public Musicista getMusicista(String  id) {
		return musicistaServices.getMusicista(id);
	}
	@GetMapping("/all")
	public List<Musicista> all(){
		return musicistaServices.musicisti();
	}
	
		
}
