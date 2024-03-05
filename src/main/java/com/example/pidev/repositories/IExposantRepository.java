package com.example.pidev.repositories;

import com.example.pidev.entities.Exposant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExposantRepository extends JpaRepository<Exposant,Long> {
}
