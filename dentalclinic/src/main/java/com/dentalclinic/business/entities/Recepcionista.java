package com.dentalclinic.business.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="recepcionista")
@PrimaryKeyJoinColumn(name = "recepcionista_id")
public class Recepcionista extends Persona{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recepcionista_id")
    public Integer idRecepcionista;
    
    

	public Recepcionista(Integer idRecepcionista) {
		super();
		this.idRecepcionista = idRecepcionista;
	}

	public Integer getIdRecepcionista() {
		return idRecepcionista;
	}

	public void setIdRecepcionista(Integer idRecepcionista) {
		this.idRecepcionista = idRecepcionista;
	}
    
    
    
}