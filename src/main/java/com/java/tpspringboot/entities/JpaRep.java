package com.java.tpspringboot.entities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JpaRep extends JpaRepository<Etudiant,Long> {
     List<Etudiant> findByDepartment(String dep);
     List<Etudiant> findByequipeList(String niveau);

}
