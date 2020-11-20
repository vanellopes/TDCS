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
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "paciente")
@PrimaryKeyJoinColumn(name = "paciente_id")
public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "paciente_id")
	public Integer idPaciente;
	public String direccion;
	private String num_hc;
	private Integer num_documento;
	private String nombre;
	private String apellido;
	private Date fecha_nac;
	private Integer celular;
	private String mail;

	@JoinColumn(name = "usuario_id")
	@OneToOne(cascade = CascadeType.ALL)
	private Usuario usuario;

	public Paciente() {
	}

	public Integer getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getNumHistoriaClinica() {
		return num_hc;
	}

	public void setNumHistoriaClinica(String numHistoriaClinica) {
		this.num_hc = numHistoriaClinica;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
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