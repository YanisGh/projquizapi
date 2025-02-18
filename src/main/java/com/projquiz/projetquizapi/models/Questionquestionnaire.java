package com.projquiz.projetquizapi.models;

import jakarta.persistence.*;

@Entity
@Table(name = "questionquestionnaire")
public class Questionquestionnaire {
    @EmbeddedId
    private QuestionquestionnaireId id;

    @MapsId("idQuestionnaire")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idQuestionnaire", nullable = false)
    private Questionnaire idQuestionnaire;

    @MapsId("idQuestion")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idQuestion", nullable = false)
    private Question idQuestion;

    public QuestionquestionnaireId getId() {
        return id;
    }

    public void setId(QuestionquestionnaireId id) {
        this.id = id;
    }

    public Questionnaire getIdQuestionnaire() {
        return idQuestionnaire;
    }

    public void setIdQuestionnaire(Questionnaire idQuestionnaire) {
        this.idQuestionnaire = idQuestionnaire;
    }

    public Question getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(Question idQuestion) {
        this.idQuestion = idQuestion;
    }

}