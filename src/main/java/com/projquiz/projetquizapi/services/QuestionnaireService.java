package com.projquiz.projetquizapi.services;

import com.projquiz.projetquizapi.models.Question;
import com.projquiz.projetquizapi.models.Questionnaire;
import com.projquiz.projetquizapi.repositories.QuestionnaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionnaireService
{
    @Autowired
    private QuestionnaireRepository questionnaireRepository;

    public List<Question> getAllQuestionsByIdQuestionnaire(int id)
    {
       return  questionnaireRepository.findById(id).get().getQuestions().stream().toList();
    }
}
