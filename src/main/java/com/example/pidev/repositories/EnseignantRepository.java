package com.example.pidev.repositories;

import com.example.pidev.entities.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EnseignantRepository extends JpaRepository<Enseignant, Long>
{


}

