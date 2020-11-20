package com.dentalclinic.business.services.impl;

import com.dentalclinic.business.entities.Odontologo;
import com.dentalclinic.business.entities.Rol;
import com.dentalclinic.business.entities.Usuario;
import com.dentalclinic.business.repositories.OdontologoRepository;
import com.dentalclinic.business.services.GestionOdontologo;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GestionOdontologoImpl implements GestionOdontologo {

	@Autowired
	OdontologoRepository odontologoRepository;

	private final static Integer ESTADO_ACTIVO = 0;
	private final static Integer ROL = 3;

	@Override
	public void registrarOdontologo(Odontologo odontologo) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Odontologo> listarOdontologos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Odontologo insertar(Odontologo oModelPersona) {
		Usuario usuario = new Usuario();
		usuario = generarUsuario(oModelPersona.getNombre(), oModelPersona.getApellido());
		oModelPersona.setUsuario(usuario);
		return odontologoRepository.saveAndFlush(oModelPersona);
	}

	@Override
	public Odontologo actualizar(Odontologo oModelPersona) {
		// TODO Auto-generated method stub
		return null;
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
