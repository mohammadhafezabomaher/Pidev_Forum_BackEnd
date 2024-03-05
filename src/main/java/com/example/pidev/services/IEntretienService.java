package com.example.pidev.services;

import com.example.pidev.entities.Entretien;

import java.util.List;

public interface IEntretienService {
    public List<Entretien> retrieveAllEntretien();
    public Entretien retrieveEntretien(Long EntretienId);
    public Entretien addEntretien(Entretien c);
    public void removeEntretien(Long EntretienId);
    public Entretien modifyEntretien(Entretien entretien);
}
