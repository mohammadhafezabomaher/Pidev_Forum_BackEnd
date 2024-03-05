package com.example.pidev.services;

import com.example.pidev.entities.Offre;
import com.example.pidev.repositories.IOffreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OffreServiceImpl implements IOffreService {

    @Autowired
    IOffreRepository iOffreRepository;

    @Override
    public Page<Offre> fetchAll2(Pageable pageable) {
        return iOffreRepository.findAll(pageable);
    }

    @Override
    public List<Offre> findByTitreContainingIgnoreCase(String titre) {
        return iOffreRepository.findByTitreContainingIgnoreCase(titre);
    }

    @Override
    public List<Offre> searchByTitre(String titre) {
        return iOffreRepository.findByTitreContainingIgnoreCase(titre);
    }


    @Override
    public Offre findById(Long id) {
        return iOffreRepository.findById(id).get();
    }

    @Override
    public List<Offre> retrieveAllOffres()  {
        return iOffreRepository.findAll();
    }

    @Override
    public Offre retrieveOffre(Long idOffre) {
        return iOffreRepository.findById(idOffre).get();
    }

    @Override
    public Offre addOffre(Offre o) {
        return iOffreRepository.save(o);
    }

    @Override
    public void removeOffre(Long idOffre) {
        iOffreRepository.deleteById(idOffre);

    }


    @Override
    public Offre ModifyOffre(Offre o) {
        return iOffreRepository.save(o);
    }
}
