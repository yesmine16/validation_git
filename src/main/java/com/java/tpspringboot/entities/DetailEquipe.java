package  com.java.tpspringboot.entities;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
public class DetailEquipe implements Serializable {

    private static final long serialVersionUID = 3360413939824062297L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDetailEquipe;

    private Integer salle;

    private String thematique;

    @OneToOne(mappedBy = "detailEquipe")
    private Equipe equipe;
}
