package  com.java.tpspringboot.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
public class Department implements Serializable {
    private static final long serialVersionUID = -3019626686518456998L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDepartment;
    private int x;

    private String nomDepart;


    @OneToMany(cascade = CascadeType.ALL,mappedBy = "department")
    private List<Etudiant> etudiantList;

}

