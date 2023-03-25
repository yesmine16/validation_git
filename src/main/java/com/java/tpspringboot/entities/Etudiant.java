package  com.java.tpspringboot.entities;

import com.java.tpspringboot.enums.Option;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
public class Etudiant implements Serializable {

    private static final long serialVersionUID = -2431119413878036197L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idEtudiant;

    private String prenomE;

    private String nomE;

    @Enumerated(EnumType.STRING)
    private Option options;

    @ManyToOne
    private Department department;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Equipe> equipeList;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "Etudiant")
    private List<Contrat> contratList;

}
