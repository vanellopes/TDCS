package com.dentalclinic.business.entities;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "odontologo")
public class Odontologo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "odontologo_id")
	public Integer idOdontologo;
	private String matricula;
	private Integer num_documento;
	private String nombre;
	private String apellido;
	private Date fecha_nac;
	private Integer celular;
	private String mail;

	@JoinColumn(name = "usuario_id")
	@OneToOne(cascade = CascadeType.ALL)
	private Usuario usuario;

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

	public Integer getNum_documento() {
		return num_documento;
	}

	public void setNum_documento(Integer num_documento) {
		this.num_documento = num_documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombres) {
		this.nombre = nombres;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellidos) {
		this.apellido = apellidos;
	}

	public Date getFechaNacimiento() {
		return fecha_nac;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fecha_nac = fechaNacimiento;
	}

	public Integer getCelular() {
		return celular;
	}

	public void setCelular(Integer celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return mail;
	}

	public void setEmail(String email) {
		this.mail = email;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void convertFechaTurno(String fechaHora) {
		Date date = null;
		try {
			DateFormat fechaHoraFormat = new SimpleDateFormat("yyyy-MM-dd");
			date = fechaHoraFormat.parse(fechaHora);
			System.out.println(date);

		} catch (ParseException e) {
			System.out.println("Error: " + e.getMessage());
		}

		this.fecha_nac = date;
	}
}