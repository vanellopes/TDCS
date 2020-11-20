package com.dentalclinic.business.services.impl;

import com.dentalclinic.business.entities.Paciente;
import com.dentalclinic.business.entities.Rol;
import com.dentalclinic.business.entities.Usuario;
import com.dentalclinic.business.repositories.PacienteRepository;
import com.dentalclinic.business.services.GestionPaciente;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GestionPacienteImpl implements GestionPaciente {

	@Autowired
	private PacienteRepository pacienteRepository;

	private final static Integer ESTADO_ACTIVO = 0;
	private final static Integer ROL = 3;

	@Override
	public List<Paciente> listarPacientes() {
		return (List<Paciente>) pacienteRepository.findAll();
	}

	@Override
	public Paciente registrarPaciente(Paciente pacientes) {
		return pacienteRepository.save(pacientes);

	}

	@Override
	public Paciente insertar(Paciente oModelPersona) {
		Usuario usuario = new Usuario();
		usuario = generarUsuario(oModelPersona.getNombre(), oModelPersona.getApellido());
		oModelPersona.setUsuario(usuario);
		return pacienteRepository.save(oModelPersona);
	}

	private Usuario generarUsuario(String nombre, String apellido) {
		Usuario usuario = new Usuario();
		String nombreUsuario = (nombre.charAt(0) + apellido.replaceAll(" ", ""));

		String password = new Random().ints(10, 33, 122)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
		usuario.setUsuario(nombreUsuario);
		usuario.setEstado(ESTADO_ACTIVO);
		usuario.setPassword(password);
		Rol rol = new Rol();
		rol.setIdRol(ROL);
		usuario.setRol(rol);

		return usuario;

	}

}
