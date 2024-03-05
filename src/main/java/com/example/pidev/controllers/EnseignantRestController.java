package com.example.pidev.controllers;

import com.example.pidev.entities.Enseignant;
import com.example.pidev.services.IEnseignantService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component
@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/enseignant")
public class EnseignantRestController {
    IEnseignantService enseignantService;

    // http://localhost:3310/enseignant/retrieve-all-enseignant
    @GetMapping("/retrieve-all-enseignant")
    public List<Enseignant> getEnseignant() {
        List<Enseignant> listEnseignant = enseignantService.retrieveAllEnseignant();
        return listEnseignant;
    }
    // http://localhost:3310/enseignant/retrieve-enseignant/2
    @GetMapping("/retrieve-enseignant/{enseignant-id}")
    public Enseignant retrieveEnseignant(@PathVariable("enseignant-id") Long chId) {
        Enseignant enseignant = enseignantService.retrieveEnseignant(chId);
        return enseignant;
    }
    // http://localhost:3310/enseignant/add-enseignant
   /* @PostMapping("/add-enseignant")
    public Enseignant addEnseignant(@RequestBody Enseignant c) {
        Enseignant enseignant = enseignantService.addEnseignant(c);
        return enseignant;
    }
*/
    @PostMapping("/add-enseignant")
    public ResponseEntity<String> addEnseignant(@RequestParam("image") MultipartFile image,
                                                @RequestParam("dateDebut") String dateDebutString,
                                                @RequestParam("email") String email,
                                                @RequestParam("name") String name,
                                                @RequestParam("specialty") String specialty,
                                                @RequestParam("contact") String contact) {
        try {
            // Read the image content
            byte[] imageData = image.getBytes();

            // Parse the dateDebutString into a Date object
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date dateDebut = dateFormat.parse(dateDebutString);

            // Create a new Enseignant object and set the image data and other parameters
            Enseignant enseignant = new Enseignant();
            enseignant.setImage(imageData);
            enseignant.setDateDebut(dateDebut);
            enseignant.setEmail(email);
            enseignant.setName(name);
            enseignant.setSpecialty(specialty);
          //  enseignant.setContact(contact);
            // Set other parameters as needed

            // Save the Enseignant object
            enseignantService.addEnseignant(enseignant);

            return ResponseEntity.ok("{\"message\": \"Enseignant added successfully\"}");
        } catch (ParseException | IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"message\": \"Failed to add enseignant. Invalid date format.\"}");
        }
    }
    // http://localhost:3310/enseignant/remove-enseignant/1
    @DeleteMapping("/remove-enseignant/{enseignant-id}")
    public void removeEnseignant(@PathVariable("enseignant-id") Long chId) {
        enseignantService.removeEnseignant(chId);
    }
    // http://localhost:3310/enseignant/modify-enseignant
    @PutMapping("/modify-enseignant")
    public Enseignant modifyEnseignant(@RequestBody Enseignant c) {
        Enseignant enseignant = enseignantService.modifyEnseignant(c);
        return enseignant;
    }
}
