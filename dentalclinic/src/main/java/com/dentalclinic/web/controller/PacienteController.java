package com.dentalclinic.web.controller;

import com.dentalclinic.business.entities.Paciente;
import com.dentalclinic.business.services.GestionPaciente;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PacienteController {

	@Autowired
	private GestionPaciente gestionPaciente;

	@RequestMapping(value = "/listado-paciente", method = RequestMethod.GET)
	public ModelAndView lista(HttpServletRequest request, HttpServletResponse response) throws Exception {

		Map<String, Object> myModel = new HashMap<String, Object>();
		try {

			List<Paciente> personas = this.gestionPaciente.listarPacientes();
			myModel.put("pacientes", personas);
		} catch (Exception e) {
			return new ModelAndView("/error", "mensaje", e.getMessage());
		}
		return new ModelAndView("listadoPaciente", "model", myModel);
	}

	@RequestMapping(value = "/nuevo-paciente", method = RequestMethod.GET)
	public ModelAndView ingresar(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return new ModelAndView("nuevoPaciente");
	}

	@RequestMapping(value = "/nuevo-paciente", method = RequestMethod.POST)
	public ModelAndView registroOdontologo(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("registrarPaciente");

		Paciente oModelPersona = new Paciente();
		oModelPersona.setNombre(request.getParameter("txtNombre"));
		oModelPersona.setNum_documento(Integer.parseInt(request.getParameter("txtDNI")));
		oModelPersona.setApellido(request.getParameter("txtApellido"));
		oModelPersona.setCelular(Integer.parseInt(request.getParameter("txtTelefono")));
		oModelPersona.setNumHistoriaClinica(request.getParameter("txtMatricula"));
		oModelPersona.setEmail(request.getParameter("txtEmail"));
		String fecha = (request.getParameter("fecha"));
		oModelPersona.convertFechaTurno(fecha);

		try {
			gestionPaciente.insertar(oModelPersona);

		} catch (Exception e) {
			System.out.println("registrarpaciente" + e.getMessage());
			return new ModelAndView("/error", "mensaje", e.getMessage());
		}
		return new ModelAndView("nuevoPaciente");
	}
}
