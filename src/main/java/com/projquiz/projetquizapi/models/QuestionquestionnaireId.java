package com.projquiz.projetquizapi.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class QuestionquestionnaireId implements Serializable {
    private static final long serialVersionUID = 5735283681150663251L;
    @Column(name = "idQuestionnaire", nullable = false)
    private Integer idQuestionnaire;

    @Column(name = "idQuestion", nullable = false)
    private Integer idQuestion;

    public Integer getIdQuestionnaire() {
        return idQuestionnaire;
    }

    public void setIdQuestionnaire(Integer idQuestionnaire) {
        this.idQuestionnaire = idQuestionnaire;
    }

    public Integer getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(Integer idQuestion) {
        this.idQuestion = idQuestion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        QuestionquestionnaireId entity = (QuestionquestionnaireId) o;
        return Objects.equals(this.idQuestion, entity.idQuestion) &&
                Objects.equals(this.idQuestionnaire, entity.idQuestionnaire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idQuestion, idQuestionnaire);
    }

}