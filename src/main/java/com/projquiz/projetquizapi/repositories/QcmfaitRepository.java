package com.projquiz.projetquizapi.repositories;

import com.projquiz.projetquizapi.models.Etudiant;
import com.projquiz.projetquizapi.models.Qcmfait;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QcmfaitRepository extends JpaRepository<Qcmfait, Integer> {
    //List<Qcmfait> findQcmfaitByIdEtudiant(Etudiant etudiant);



    //List<Qcmfait> findQcmfaitByIdEtudiant(Etudiant idEtudiant);

}
