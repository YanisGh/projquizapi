package com.projquiz.projetquizapi.repositories;

import com.projquiz.projetquizapi.DTO.ReponseDTO;
import com.projquiz.projetquizapi.models.Questionreponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionReponseRepository extends JpaRepository<Questionreponse, Integer> {



    List<Questionreponse> findAllByIdQuestion_Id(Integer idQuestionId);


    @Query("select new com.projquiz.projetquizapi.DTO.ReponseDTO(r.valeur,q.bonne) from Questionreponse q inner join Reponse r on q.idReponse.id = r.id where q.id.idQuestion=:numQuestion")
    List<ReponseDTO> getAllReponseByQuestion_Id(@Param("numQuestion") Integer numQuestion);

}
