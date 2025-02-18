package com.projquiz.projetquizapi.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class QcmfaitId implements Serializable {
    private static final long serialVersionUID = 2264515060341456710L;
    @Column(name = "idEtudiant", nullable = false)
    private Integer idEtudiant;

    @Column(name = "idQuestionnaire", nullable = false)
    private Integer idQuestionnaire;

    public Integer getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(Integer idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public Integer getIdQuestionnaire() {
        return idQuestionnaire;
    }

    public void setIdQuestionnaire(Integer idQuestionnaire) {
        this.idQuestionnaire = idQuestionnaire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        QcmfaitId entity = (QcmfaitId) o;
        return Objects.equals(this.idQuestionnaire, entity.idQuestionnaire) &&
                Objects.equals(this.idEtudiant, entity.idEtudiant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idQuestionnaire, idEtudiant);
    }

}