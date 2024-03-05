package com.example.pidev.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Exposant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idExposant;
    private String siteOfficiel;

    private String pack;
    @OneToOne (cascade = CascadeType.ALL)
    private Contact contact;
    @OneToMany(mappedBy = "exposant", cascade = CascadeType.ALL)
    private List<Offre>offres;

}
