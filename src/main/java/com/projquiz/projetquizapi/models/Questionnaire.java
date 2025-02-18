package com.projquiz.projetquizapi.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "questionnaire")
public class Questionnaire {
    @Id
    @Column(name = "idQuestionnaire", nullable = false)
    private Integer id;

    @Column(name = "libelleQuestionnaire", nullable = false, length = 100)
    private String libelleQuestionnaire;

    @OneToMany(mappedBy = "idQuestionnaire")
    private Set<Qcmfait> qcmfaits = new LinkedHashSet<>();

    @ManyToMany
    @JoinTable(
            name = "questionquestionnaire", // Nom correct de la table de jointure
            joinColumns = @JoinColumn(name = "idQuestionnaire"),
            inverseJoinColumns = @JoinColumn(name = "idQuestion")
    )
    private Set<Question> questions = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibelleQuestionnaire() {
        return libelleQuestionnaire;
    }

    public void setLibelleQuestionnaire(String libelleQuestionnaire) {
        this.libelleQuestionnaire = libelleQuestionnaire;
    }

    public Set<Qcmfait> getQcmfaits() {
        return qcmfaits;
    }

    public void setQcmfaits(Set<Qcmfait> qcmfaits) {
        this.qcmfaits = qcmfaits;
    }

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }

}