package com.projquiz.projetquizapi.services;

import com.projquiz.projetquizapi.models.Etudiant;
import com.projquiz.projetquizapi.models.Qcmfait;
import com.projquiz.projetquizapi.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService
{
    @Autowired
    private EtudiantRepository etudiantRepository;

    //Pour se connecter
    public Etudiant getEtudiantByLoginAndMdp(String login, Short mdp)
    {
        return etudiantRepository.findEtudiantByLoginAndMotDePasse(login, mdp);
    }
    //Pour s'inscrire
    public void insertEtudiant(String login, Short mdp, String nom, String prenom, String email)
    {
        //Faudra Check si il existe dans le front
        Etudiant etudiant = new Etudiant();
        etudiant.setLogin(login);
        etudiant.setMotDePasse(mdp);
        etudiant.setNom(nom);
        etudiant.setPrenom(prenom);
        etudiant.setEmail(email);
        etudiant.setStatut(0);
        etudiantRepository.save(etudiant);
    }

    public Etudiant getEtudiantById(int id)
    {
        return etudiantRepository.findById(id).get();
    }

    public List<Qcmfait> QcmfaitsByEtudiant(int idEtudiant)
    {
        return  etudiantRepository.findById(idEtudiant).get().getQcmfaits().stream().toList();
    }
}
