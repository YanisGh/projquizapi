package com.projquiz.projetquizapi.models;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "reponse")
public class Reponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idReponse", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "valeur", nullable = false)
    private String valeur;

    @Column(name = "cheminImage", nullable = false, length = 1000)
    private String cheminImage;

    @OneToMany(mappedBy = "idReponse")
    private Set<Questionreponse> questionreponses = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public String getCheminImage() {
        return cheminImage;
    }

    public void setCheminImage(String cheminImage) {
        this.cheminImage = cheminImage;
    }

    public Set<Questionreponse> getQuestionreponses() {
        return questionreponses;
    }

    public void setQuestionreponses(Set<Questionreponse> questionreponses) {
        this.questionreponses = questionreponses;
    }

}