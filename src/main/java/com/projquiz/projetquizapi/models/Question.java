package com.projquiz.projetquizapi.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idQuestion", nullable = false)
    private Integer id;

    @Column(name = "libelleQuestion", nullable = false, length = 100)
    private String libelleQuestion;

    @Column(name = "type", nullable = false)
    private Integer type;

    @Column(name = "nbReponse", nullable = false)
    private Integer nbReponse;

    @Column(name = "nbBonneReponse", nullable = false)
    private Integer nbBonneReponse;

    @ManyToMany
    @JsonIgnore
    @JoinTable(name = "questionquestionnaire",
            joinColumns = @JoinColumn(name = "idQuestion"),
            inverseJoinColumns = @JoinColumn(name = "idQuestionnaire"))
    private Set<Questionnaire> questionnaires = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idQuestion")
    @JsonIgnore
    private Set<Questionreponse> questionreponses = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibelleQuestion() {
        return libelleQuestion;
    }

    public void setLibelleQuestion(String libelleQuestion) {
        this.libelleQuestion = libelleQuestion;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getNbReponse() {
        return nbReponse;
    }

    public void setNbReponse(Integer nbReponse) {
        this.nbReponse = nbReponse;
    }

    public Integer getNbBonneReponse() {
        return nbBonneReponse;
    }

    public void setNbBonneReponse(Integer nbBonneReponse) {
        this.nbBonneReponse = nbBonneReponse;
    }

    public Set<Questionnaire> getQuestionnaires() {
        return questionnaires;
    }

    public void setQuestionnaires(Set<Questionnaire> questionnaires) {
        this.questionnaires = questionnaires;
    }

    public Set<Questionreponse> getQuestionreponses() {
        return questionreponses;
    }

    public void setQuestionreponses(Set<Questionreponse> questionreponses) {
        this.questionreponses = questionreponses;
    }

}