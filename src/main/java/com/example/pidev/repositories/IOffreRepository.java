package com.example.pidev.repositories;

import com.example.pidev.entities.Exposant;
import com.example.pidev.entities.Offre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOffreRepository extends JpaRepository<Offre,Long> {
    List<Offre> findByTitreContainingIgnoreCase(String titre);

}
