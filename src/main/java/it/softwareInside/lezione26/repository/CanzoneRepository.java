package it.softwareInside.lezione26.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.softwareInside.lezione26.models.Canzone;

public interface CanzoneRepository extends JpaRepository<Canzone, String> {

}
