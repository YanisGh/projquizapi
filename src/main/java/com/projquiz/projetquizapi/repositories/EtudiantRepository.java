package com.projquiz.projetquizapi.repositories;

import com.projquiz.projetquizapi.models.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Integer>
{
    Etudiant findEtudiantByLoginAndMotDePasse(String login, Short motDePasse);



    @Override
    Optional<Etudiant> findById(Integer integer);

    @Override
    <S extends Etudiant> S save(S entity);

    @Override
    <S extends Etudiant> List<S> saveAllAndFlush(Iterable<S> entities);


}
