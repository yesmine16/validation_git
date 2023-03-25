package com.java.tpspringboot.entities;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Controller {
    @Autowired
    public JpaRep rep;
    public List<Etudiant> findSeniors() {
        return rep.findByequipeList("SENIOR");
    }
    public List<Etudiant> findStudentsByDepartment(String department) {
        return rep.findByDepartment(department);
    }
}
