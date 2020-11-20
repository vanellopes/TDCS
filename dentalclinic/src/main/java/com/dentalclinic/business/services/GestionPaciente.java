package com.dentalclinic.business.services;

import com.dentalclinic.business.entities.Paciente;

import java.util.List;

public interface GestionPaciente {

	public List<Paciente> listarPacientes();

	Paciente registrarPaciente(Paciente pacientes);

	public Paciente insertar(Paciente oModelPersona);

}
