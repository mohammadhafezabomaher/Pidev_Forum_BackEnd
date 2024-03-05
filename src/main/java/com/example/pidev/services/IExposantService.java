package com.example.pidev.services;

import com.example.pidev.entities.Exposant;

import java.util.List;

public interface IExposantService {
    public List<Exposant> retrieveAllExposants();
    public Exposant retrieveExposant(Long idExposant);
    public Exposant addExposant(Exposant e);
    public void removeExposant(Long idExposant);
    public Exposant modifyExposant(Exposant e);
}
