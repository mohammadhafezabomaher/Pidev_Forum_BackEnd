package com.example.pidev.services;

import com.example.pidev.entities.Enseignant;

import java.util.List;

public interface IEnseignantService {
    public List<Enseignant> retrieveAllEnseignant();
    public Enseignant retrieveEnseignant(Long EnseignantId);
    public Enseignant addEnseignant(Enseignant c);
    public void removeEnseignant(Long EnseignantId);
    public Enseignant modifyEnseignant(Enseignant enseignant);


}
