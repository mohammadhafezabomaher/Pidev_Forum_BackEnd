package com.example.pidev.repositories;

import com.example.pidev.entities.Pack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPackRepository extends JpaRepository<Pack,Integer> {
}
