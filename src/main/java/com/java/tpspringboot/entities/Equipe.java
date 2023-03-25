package  com.java.tpspringboot.entities;

import com.java.tpspringboot.enums.Niveau;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity

public class Equipe implements Serializable {

    private static final long serialVersionUID = 1855575254799627225L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEquipe;

    private String nomEquipe;

    private Niveau niveau;

    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "equipeList")
    private List<Etudiant> etudiantList;

    @OneToOne
    private DetailEquipe detailEquipe;

}