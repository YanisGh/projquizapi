package com.projquiz.projetquizapi;

import com.projquiz.projetquizapi.DTO.ReponseDTO;
import com.projquiz.projetquizapi.models.*;
import com.projquiz.projetquizapi.services.EtudiantService;
import com.projquiz.projetquizapi.services.QcmfaitService;
import com.projquiz.projetquizapi.services.QuestionReponseService;
import com.projquiz.projetquizapi.services.QuestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class QuizzController
{
    private Etudiant etudiantConnecte;
    @Autowired
    private EtudiantService etudiantService;
    @Autowired
    private QuestionReponseService questionReponseService;
    @Autowired
    private QuestionnaireService questionnaireService;

    @PostMapping(value = "/connexion")
    public Etudiant verifEtudiant(@RequestBody Map<String ,Object> datas)
    {
        try {
            etudiantConnecte = etudiantService.getEtudiantByLoginAndMdp(
                    datas.get("login").toString(),
                    Short.parseShort(datas.get("mdp").toString())
            );

            return etudiantConnecte;
        } catch (Exception e) {
            System.err.println("Erreur : " + e.getMessage());
        }

        return null;

    }

    @PostMapping(value = "/inscription")
    public void inscriptionEtudiant(@RequestBody Map<String ,Object> datas)
    {
        try{
            String login = datas.get("login").toString();
            Short mdp = Short.parseShort(datas.get("mdp").toString());
            String nom = datas.get("nom").toString();
            String prenom = datas.get("prenom").toString();
            String email = datas.get("email").toString();
            etudiantService.insertEtudiant(login, mdp, nom, prenom, email);

        } catch (Exception e) {
            System.err.println("Erreur : " + e.getMessage());
        }

    }

    @PostMapping(value = "/qcmetudiant/{idEtudiant}")
    public List<Qcmfait> recupQcmfaitEtudiant (@PathVariable int idEtudiant)
    {
        Etudiant etudiant = etudiantService.getEtudiantById(idEtudiant);
        try{

            List<Qcmfait> qcmfaitsList = etudiantService.QcmfaitsByEtudiant(etudiant.getId());
            return qcmfaitsList;

        } catch (Exception e) {
            System.err.println("Erreur : " + e.getMessage());
        }
        return null;
    }

    @PostMapping("/qcmQuestionnaire/{idQuestionnaire}/questionnaire")
    public List<Question> recupQuestionnaireQcm (@PathVariable int idQuestionnaire) {
        try {
            List<Question> lesQuestions = questionnaireService.getAllQuestionsByIdQuestionnaire(idQuestionnaire);
            return lesQuestions;
        } catch (Exception e) {
            System.err.println("Erreur : " + e.getMessage());
        }
        return null;
    }

    @PostMapping("/qcmQuestionnaire/{idQuestion}/reponses")
    public List<ReponseDTO> recupRepQuestion (@PathVariable int idQuestion) {
        //Retrieve all question reponse where idQuestion = id de la question actuelle
        try {
            List<ReponseDTO> reponses = questionReponseService.getQuestionReponseFromIdQuestion(idQuestion);
            return reponses;
        } catch (Exception e) {
            System.err.println("Erreur : " + e.getMessage());
        }
        return null;
    }

//    @putmppp("/updatescore/{idEtudiant}/{idQuestionnaire}/{nouveauScore}")
//    public void upDateScore()
//    {
//
//    }

//        Etudiant etudiant = etudiantService.getEtudiantById(1);
//        try {
//            List<Question> questionList = List.of();
//            for(Question q : etudiant.getQcmfaits().stream().toList().get(0).getIdQuestionnaire().getQuestions().stream().toList())
//            {
//                questionList.add(q);
//            }
//             return questionList;
//            //List<Question> dee = etudiantConnecte.getQcmfaits().stream().toList().stream().findFirst().get().getIdQuestionnaire().getQuestions().stream().toList();
//            //return dee;
//
//        } catch (Exception e) {
//            System.err.println("Erreur : " + e.getMessage());
//        }
//        return null;
    }

