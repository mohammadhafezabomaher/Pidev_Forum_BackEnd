package com.example.pidev.services;

import com.example.pidev.entities.Exposant;
import com.example.pidev.repositories.IExposantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExposantServiceImpl implements IExposantService{
    @Autowired
    IExposantRepository iExposantRepository;

    @Override
    public List<Exposant> retrieveAllExposants() {
        return iExposantRepository.findAll();
    }

    @Override
    public Exposant retrieveExposant(Long idExposant) {
        return iExposantRepository.findById(idExposant).get();
    }

    @Override
    public Exposant addExposant(Exposant e) {
        return iExposantRepository.save(e);
    }

    @Override
    public void removeExposant(Long idExposant) {
         iExposantRepository.deleteById(idExposant);

    }

    @Override
    public Exposant modifyExposant(Exposant e) {
        return iExposantRepository.save(e);
    }
}
