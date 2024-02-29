package com.example.pidev.services;

import com.example.pidev.entities.Pack;
import com.example.pidev.repositories.IPackRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PackService implements IPackService{
    IPackRepository packRepository;
    @Override
    public Pack addPack(Pack p) {
        return packRepository.save(p);
    }

    @Override
    public Pack getPackById(int id) {
        return packRepository.findById(id).get();
    }

    @Override
    public List<Pack> getAllPack() {
        return packRepository.findAll();
    }

    @Override
    public Pack updatePack(Pack p) {
        return packRepository.save(p);
    }

    @Override
    public void deletePack(int id) {
        packRepository.deleteById(id);
    }
}
