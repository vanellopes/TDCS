package com.dentalclinic.business.entities;


import java.util.Date;

import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

@MappedSuperclass
public class Persona {

    private Integer num_documento;
    private String nombres;
    private String apellidos;
    private Date fechaNacimiento;
    private String celular;
    private String email;
    
    @OneToOne
    private Usuario usuario;


    public Persona() {
    }

    public Integer getNum_documento() {
        return num_documento;
    }

    public void setNum_documento(Integer num_documento) {
        this.num_documento = num_documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


}
