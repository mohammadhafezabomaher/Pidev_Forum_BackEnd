package com.example.pidev.services;

import com.example.pidev.entities.Enseignant;
import com.example.pidev.repositories.EnseignantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EnseignantServiceImpl implements IEnseignantService {
    EnseignantRepository enseignantRepository;

    public List<Enseignant> retrieveAllEnseignant() {
        return enseignantRepository.findAll();
    }

    public Enseignant retrieveEnseignant(Long enseignantId) {
        return enseignantRepository.findById(enseignantId).get();
    }



    public Enseignant addEnseignant(Enseignant c) {
        return enseignantRepository.save(c);
    }

    public void removeEnseignant(Long enseignantId) {
        enseignantRepository.deleteById(enseignantId);
    }

    public Enseignant modifyEnseignant(Enseignant enseignant) {
        return enseignantRepository.save(enseignant);
    }
}
