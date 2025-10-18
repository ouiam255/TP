package com.tp.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NamedNativeQuery(name = "FindBetweenDateNative", query = "Select * From Machine Where DateAchat Between :d1 And :d2", resultClass = Machine.class)
@NamedQuery(name = "FindBetweenDate", query = "From Machine Where DateAchat Between :d1 And :d2")
@Table(name = "Machine")
public class Machine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Name;

    @Temporal(TemporalType.DATE)
    private Date DateAchat;

    @ManyToOne
    private Salle Salle;

    public Machine(String Name, Date date, Salle Id) {
        this.Name = Name;
        this.DateAchat = date;
        this.Salle = Id;
    }


    public Machine() {

    }
}
