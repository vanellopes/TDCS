package com.dentalclinic.business.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="odontologo") 
@PrimaryKeyJoinColumn(name = "odontologo_id")
public class Odontologo extends Persona{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer idOdontologo;
    private String matricula;
    public Odontologo() {
    }

    public Integer getIdOdontologo() {
        return idOdontologo;
    }

    public void setIdOdontologo(Integer idOdontologo) {
        this.idOdontologo = idOdontologo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
