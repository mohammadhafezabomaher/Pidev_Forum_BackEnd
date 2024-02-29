package com.example.pidev.services;

import com.example.pidev.entities.Pack;

import java.util.List;

public interface IPackService {
    public Pack addPack(Pack p);
    public Pack getPackById(int id);
    public List<Pack> getAllPack();
    public Pack updatePack(Pack p);
    public void deletePack(int id);
}
