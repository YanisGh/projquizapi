package com.projquiz.projetquizapi.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class QuestionreponseId implements Serializable {
    private static final long serialVersionUID = 4186330422565731825L;
    @Column(name = "idQuestion", nullable = false)
    private Integer idQuestion;

    @Column(name = "idReponse", nullable = false)
    private Integer idReponse;

    public Integer getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(Integer idQuestion) {
        this.idQuestion = idQuestion;
    }

    public Integer getIdReponse() {
        return idReponse;
    }

    public void setIdReponse(Integer idReponse) {
        this.idReponse = idReponse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        QuestionreponseId entity = (QuestionreponseId) o;
        return Objects.equals(this.idQuestion, entity.idQuestion) &&
                Objects.equals(this.idReponse, entity.idReponse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idQuestion, idReponse);
    }

}