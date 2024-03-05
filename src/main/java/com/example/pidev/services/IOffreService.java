package com.example.pidev.services;
import org.springframework.data.domain.Page;
import com.example.pidev.entities.Contact;
import com.example.pidev.entities.Offre;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IOffreService {

    Page<Offre> fetchAll2(Pageable pageable);
    public List<Offre> retrieveAllOffres();
    public Offre retrieveOffre(Long idOffre);
    public Offre addOffre(Offre o);
    public void removeOffre(Long idOffre);


    public Offre findById (Long id);
    List<Offre> searchByTitre(String titre);
    List<Offre> findByTitreContainingIgnoreCase(String titre);


    public Offre ModifyOffre(Offre o);


}
