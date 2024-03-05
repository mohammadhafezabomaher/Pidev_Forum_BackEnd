package com.example.pidev.services;

import com.example.pidev.entities.Entretien;
import com.example.pidev.repositories.EntretienRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EntretienServiceImpl implements IEntretienService{
    EntretienRepository entretienRepository;

    public List<Entretien> retrieveAllEntretien() {
        return entretienRepository.findAll();
    }

    public Entretien retrieveEntretien(Long entretienId) {
        return entretienRepository.findById(entretienId).get();
    }



    public Entretien addEntretien(Entretien c) {
        return entretienRepository.save(c);
    }

    public void removeEntretien(Long entretienId) {
        entretienRepository.deleteById(entretienId);
    }

    public Entretien modifyEntretien(Entretien entretien) {
        return entretienRepository.save(entretien);
    }

}
