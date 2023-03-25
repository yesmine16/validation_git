package  com.java.tpspringboot.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity

public class Universite implements Serializable {

    private static final long serialVersionUID = 3795737434631536494L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUniv;

    private String nomUniv;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Department> departments;

}
