package it.softwareInside.lezione26.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareInside.lezione26.models.Musicista;
import it.softwareInside.lezione26.repository.MusicistaRepository;

@Service
public class ServicesMusicista {

	@Autowired
	MusicistaRepository musicistaRepository;

	public boolean addMusicista(Musicista musicista) {

		try {

			musicistaRepository.save(musicista);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean delete(String id) {

		try {
			
			musicistaRepository.findById(id).get();
			musicistaRepository.deleteById(id);
			
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean deleteAll() {

		try {
			musicistaRepository.deleteAll();
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public Musicista getMusicista(String id) {

		try {

			return musicistaRepository.findById(id).get();
			 

		} catch (Exception e) {
			return null;
		}
	}

	public List<Musicista> musicisti() {

		try {

			return musicistaRepository.findAll();

		} catch (Exception e) {
			return null;
		}
	}

}
