package com.example.pidev.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Enseignant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEnseignant;
    private Date dateDebut;
    private String email;
    private String name;
    private String specialty;
    @Lob
    private byte[] image;
    @OneToOne
    private Contact contact;

    @ManyToOne
    private Entretien entretien;
}
