package com.dentalclinic.business.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="estado_turno") 
@PrimaryKeyJoinColumn(name = "estado_turno_id")
public class EstadoTurno {
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idEstado;

    private String descripcion;

    private String nombre;

    
    
	public int getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
    

}
