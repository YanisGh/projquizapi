package com.projquiz.projetquizapi.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "questionreponse")
public class Questionreponse {
    @EmbeddedId
    private QuestionreponseId id;

    @MapsId("idQuestion")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idQuestion", nullable = false)
    @JsonIgnore
    private Question idQuestion;

    @MapsId("idReponse")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idReponse", nullable = false)
    @JsonIgnore
    private Reponse idReponse;

    @Column(name = "ordre", nullable = false)
    private Integer ordre;

    @Column(name = "bonne", nullable = false)
    private Integer bonne;

    public QuestionreponseId getId() {
        return id;
    }

    public void setId(QuestionreponseId id) {
        this.id = id;
    }

    public Question getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(Question idQuestion) {
        this.idQuestion = idQuestion;
    }

    public Reponse getIdReponse() {
        return idReponse;
    }

    public void setIdReponse(Reponse idReponse) {
        this.idReponse = idReponse;
    }

    public Integer getOrdre() {
        return ordre;
    }

    public void setOrdre(Integer ordre) {
        this.ordre = ordre;
    }

    public Integer getBonne() {
        return bonne;
    }

    public void setBonne(Integer bonne) {
        this.bonne = bonne;
    }

}