package com.tp.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Salle")
@Getter
@Setter
public class Salle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Ref;

    @OneToMany(mappedBy = "salle", fetch = FetchType.EAGER)
    private List<Machine> Machines;

    public Salle(String Ref) {
        this.Ref = Ref;
    }

    public Salle() {}
}
