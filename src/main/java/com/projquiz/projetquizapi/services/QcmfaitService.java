package com.projquiz.projetquizapi.services;

import com.projquiz.projetquizapi.models.Etudiant;
import com.projquiz.projetquizapi.models.Qcmfait;
import com.projquiz.projetquizapi.repositories.QcmfaitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QcmfaitService
{
    @Autowired
    private QcmfaitRepository qcmfaitRepository;

//    public List<Qcmfait> getQcmfaitByIdEtudiant(Etudiant etudiant)
//    {
//        return qcmfaitRepository.findQcmfaitByIdEtudiant(etudiant);
//    }
}
