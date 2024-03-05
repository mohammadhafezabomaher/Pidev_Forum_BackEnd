package com.example.pidev.controllers;

import com.example.pidev.entities.Exposant;
import com.example.pidev.services.IExposantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exposant")
public class ExposantController {
@Autowired
    IExposantService exposantService;
    @PostMapping("/addExposant")
    public Exposant addExposant(@RequestBody Exposant e){
        return exposantService.addExposant(e);
    }

    @GetMapping("/retrieveAllExposants")
    public List<Exposant> getExposants()
    {
        return exposantService.retrieveAllExposants();
    }


    @DeleteMapping("/DeleteExposant/{id}")
    public void SupprimerExposant(@PathVariable("id") Long id){
        exposantService.removeExposant(id);
    }

    @PutMapping("/ModifyExposant/{id}")
    public Exposant ModifyChambre(@PathVariable("id") Long id,@RequestBody Exposant e1){
        Exposant e = exposantService.retrieveExposant(id);
        e.setContact(e1.getContact());
        e.setPack(e1.getPack());
        e.setOffres(e1.getOffres());
        e.setSiteOfficiel(e1.getSiteOfficiel());

        return exposantService.modifyExposant(e);
    }




}
