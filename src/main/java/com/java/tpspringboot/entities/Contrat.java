package  com.java.tpspringboot.entities;

import com.java.tpspringboot.enums.Specialite;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
@Entity
public class Contrat implements Serializable {
    private static final long serialVersionUID = -2521336636637809163L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idContrat;

    @Temporal(TemporalType.DATE)
    private Date dateDebutContrat;

    @Temporal(TemporalType.DATE)
    private Date dateFinContrat;

    private Specialite specialite;
    private Boolean archive;

    private Integer montantContrat;

    @ManyToOne
    private Etudiant Etudiant;


}
