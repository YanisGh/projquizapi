package com.projquiz.projetquizapi.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "qcmfait")
public class Qcmfait {
    @EmbeddedId
    private QcmfaitId id;

    @JsonIgnore
    @MapsId("idEtudiant")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idEtudiant", nullable = false)
    private Etudiant idEtudiant;

    @JsonIgnore
    @MapsId("idQuestionnaire")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idQuestionnaire", nullable = false)
    private Questionnaire idQuestionnaire;

    //Mettre des JsonIgnore qql part pr eviter de boucler
    @Column(name = "dateFait", nullable = false, length = 10)
    private String dateFait;

    @Column(name = "point", nullable = false)
    private Integer point;

    public QcmfaitId getId() {
        return id;
    }

    public void setId(QcmfaitId id) {
        this.id = id;
    }

    public Etudiant getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(Etudiant idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public Questionnaire getIdQuestionnaire() {
        return idQuestionnaire;
    }

    public void setIdQuestionnaire(Questionnaire idQuestionnaire) {
        this.idQuestionnaire = idQuestionnaire;
    }

    public String getDateFait() {
        return dateFait;
    }

    public void setDateFait(String dateFait) {
        this.dateFait = dateFait;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

}