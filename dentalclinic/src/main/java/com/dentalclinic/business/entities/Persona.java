package com.dentalclinic.business.entities;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@MappedSuperclass
public class Persona {

    private Integer num_documento;
    private String nombre;
    private String apellido;
    private Date fecha_nac;
    private String celular;
    private String mail;
    
    @OneToOne(cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Usuario usuario_id;


    public Persona() {
    }

    public Integer getNum_documento() {
        return num_documento;
    }

    public void setNum_documento(Integer num_documento) {
        this.num_documento = num_documento;
    }

    public String getNombres() {
        return nombre;
    }

    public void setNombres(String nombres) {
        this.nombre = nombres;
    }

    public String getApellidos() {
        return apellido;
    }

    public void setApellidos(String apellidos) {
        this.apellido = apellidos;
    }

    public Date getFechaNacimiento() {
        return fecha_nac;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fecha_nac = fechaNacimiento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return mail;
    }

    public void setEmail(String email) {
        this.mail = email;
    }

	public Usuario getUsuario() {
		return usuario_id;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario_id = usuario;
	}


}
