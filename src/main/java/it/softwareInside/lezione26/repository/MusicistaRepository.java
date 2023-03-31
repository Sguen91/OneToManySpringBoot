package it.softwareInside.lezione26.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.softwareInside.lezione26.models.Musicista;

public interface MusicistaRepository extends JpaRepository<Musicista, String>{

}
