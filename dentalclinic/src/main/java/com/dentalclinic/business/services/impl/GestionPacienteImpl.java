package com.dentalclinic.business.services.impl;

import com.dentalclinic.business.entities.Paciente;
import com.dentalclinic.business.repositories.PacienteRepository;
import com.dentalclinic.business.services.GestionPaciente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GestionPacienteImpl implements GestionPaciente{
	
	
	@Autowired
    private PacienteRepository pacienteRepository;

    public List<Paciente> listarPacientes() {
        return (List<Paciente>) pacienteRepository.findAll();
    }

    public void increasePrice(int percentage) {
        List<Paciente> products = (List<Paciente>) pacienteRepository.findAll();
        
    }

	@Override
	public void registrarPaciente(List<Paciente> pacientes) {
		// TODO Auto-generated method stub
		
	}

}
