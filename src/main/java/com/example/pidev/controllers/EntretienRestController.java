package com.example.pidev.controllers;

import com.example.pidev.entities.Entretien;
import com.example.pidev.services.IEntretienService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Component
@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/entretien")
public class EntretienRestController {
    IEntretienService entretienService;

    // http://localhost:3310/entretien/retrieve-all-entretien
    @GetMapping("/retrieve-all-entretien")
    public List<Entretien> getEntretien() {
        List<Entretien> listEntretien = entretienService.retrieveAllEntretien();
        return listEntretien;
    }
    // http://localhost:3310/entretien/retrieve-entretien/2
    @GetMapping("/retrieve-entretien/{entretien-id}")
    public Entretien retrieveEntretien(@PathVariable("entretien-id") Long chId) {
        Entretien entretien = entretienService.retrieveEntretien(chId);
        return entretien;
    }
    // http://localhost:3310/entretien/add-entretien
    @PostMapping("/add-entretien")
    public Entretien addEntretien(@RequestBody Entretien c) {
        Entretien entretien = entretienService.addEntretien(c);
        return entretien;
    }
    // http://localhost:3310/entretien/remove-entretien/1
    @DeleteMapping("/remove-entretien/{entretien-id}")
    public void removeEntretien(@PathVariable("entretien-id") Long chId) {
        entretienService.removeEntretien(chId);
    }
    // http://localhost:3310/entretien/modify-entretien
    @PutMapping("/modify-entretien")
    public Entretien modifyEntretien(@RequestBody Entretien c) {
        Entretien entretien = entretienService.modifyEntretien(c);
        return entretien;
    }
}
