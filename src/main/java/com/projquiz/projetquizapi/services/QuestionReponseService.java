package com.projquiz.projetquizapi.services;

import com.projquiz.projetquizapi.DTO.ReponseDTO;
import com.projquiz.projetquizapi.models.Questionreponse;
import com.projquiz.projetquizapi.repositories.QuestionReponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionReponseService {

    @Autowired
    private QuestionReponseRepository questionReponse;

    public List<ReponseDTO> getQuestionReponseFromIdQuestion(int idQuestion)
    {

        List<ReponseDTO> test =  questionReponse.getAllReponseByQuestion_Id(idQuestion);
        return test;
    }
}
