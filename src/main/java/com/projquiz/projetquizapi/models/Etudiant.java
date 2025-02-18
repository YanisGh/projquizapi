package com.projquiz.projetquizapi.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "etudiants")
//@NamedQueries({
//        @NamedQuery(name = "Etudiant.findByLoginAndMotDePasse", query = "select e from Etudiant e where e.login = :login and e.motDePasse = :motDePasse")
//})
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEtudiant", nullable = false)
    private Integer id;

    @Column(name = "login", nullable = false, length = 15)
    private String login;

    @Column(name = "motDePasse", nullable = false)
    private Short motDePasse;

    @Column(name = "nom", nullable = false, length = 50)
    private String nom;

    @Column(name = "prenom", nullable = false, length = 50)
    private String prenom;

    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @Column(name = "statut", nullable = false)
    private Integer statut;

    @JsonIgnore
    @OneToMany(mappedBy = "idEtudiant")
    private Set<Qcmfait> qcmfaits = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Short getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(Short motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getStatut() {
        return statut;
    }

    public void setStatut(Integer statut) {
        this.statut = statut;
    }

    public Set<Qcmfait> getQcmfaits() {
        return qcmfaits;
    }

    public void setQcmfaits(Set<Qcmfait> qcmfaits) {
        this.qcmfaits = qcmfaits;
    }

}