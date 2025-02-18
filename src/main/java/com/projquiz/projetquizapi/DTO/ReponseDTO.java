package com.projquiz.projetquizapi.DTO;

public class ReponseDTO
{
    private String libelle;
    private int bonne;

    public ReponseDTO(String libelle, int bonne) {
        this.libelle = libelle;
        this.bonne = bonne;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getBonne() {
        return bonne;
    }

    public void setBonne(int bonne) {
        this.bonne = bonne;
    }
}
