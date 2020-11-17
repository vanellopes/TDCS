package com.dentalclinic.business.services;

import com.dentalclinic.business.entities.Paciente;

import java.util.List;

public interface GestionPaciente {
	
    public void registrarPaciente(List<Paciente> pacientes);
    
    public List<Paciente> listarPacientes();

}
