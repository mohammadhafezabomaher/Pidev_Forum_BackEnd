package com.example.pidev.controllers;

import com.example.pidev.entities.Offre;
import com.example.pidev.services.IOffreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@RestController
@RequestMapping("/offre")
public class OffreController {
    @Autowired
    IOffreService offreService;


    @GetMapping("/fetchAll2")
    public ResponseEntity<Page<Offre>> fetchAll2(@RequestParam(defaultValue = "0") int page,
                                                 @RequestParam(defaultValue = "10") int size) {
        Page<Offre> offres = offreService.fetchAll2(PageRequest.of(page, size));
        if (!offres.isEmpty()) {
            return new ResponseEntity<>(offres, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/findByTitreContainingIgnoreCase")
    public ResponseEntity<List<Offre>> findByTitreContainingIgnoreCase(@RequestParam String titre) {
        List<Offre> offres = offreService.findByTitreContainingIgnoreCase(titre);
        if (!offres.isEmpty()) {
            return new ResponseEntity<>(offres, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/searchByTitre/{titre}")
    public ResponseEntity<List<Offre>> searchByTitre(@PathVariable String titre) {
        List<Offre> offres = offreService.searchByTitre(titre);
        if (offres != null && !offres.isEmpty()) {
            return new ResponseEntity<>(offres, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/addOffre")
    public Offre addOffre(@RequestBody Offre o){
        return offreService.addOffre(o);
    }

    @GetMapping("/retrieveAllOffres")
    public List<Offre> getOffres()
    {
        return offreService.retrieveAllOffres();
    }


    @GetMapping("/findById/{id}")
    public ResponseEntity<Offre> getOffreById(@PathVariable("id") Long id) {
        Offre offre = offreService.retrieveOffre(id);
        if (offre != null) {
            return new ResponseEntity<>(offre, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @DeleteMapping("/DeleteOffre/{id}")
    public void SupprimerOffre(@PathVariable("id") Long id){
        offreService.removeOffre(id);
    }

    @PutMapping("/ModifyOffre/{id}")
    public Offre ModifyOffre(@PathVariable("id") Long id,@RequestBody Offre o){
        o.setIdOffre(id);
        return offreService.ModifyOffre(o);
    }
}
