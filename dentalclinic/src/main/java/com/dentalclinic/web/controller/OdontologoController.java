package com.dentalclinic.web.controller;

import com.dentalclinic.business.entities.Odontologo;
import com.dentalclinic.business.services.GestionOdontologo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OdontologoController {

	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private GestionOdontologo gestionOdontologo;

	@RequestMapping(value = "/listado-odontologo", method = RequestMethod.GET)
	public ModelAndView lista(HttpServletRequest request, HttpServletResponse response) throws Exception {

		Map<String, Object> myModel = new HashMap<String, Object>();
		try {

			List<Odontologo> personas = this.gestionOdontologo.listarOdontologos();
			myModel.put("odontologo", personas);
		} catch (Exception e) {
			return new ModelAndView("/error", "mensaje", e.getMessage());
		}
		return new ModelAndView("listadoPaciente", "model", myModel);
	}

	@RequestMapping(value = "/nuevo-odontologo", method = RequestMethod.GET)
	public ModelAndView ingresar(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return new ModelAndView("nuevoOdontologo");
	}

	@RequestMapping(value = "/nuevo-odontologo", method = RequestMethod.POST)
	public ModelAndView registroOdontologo(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("registrarOdontologo");

		Odontologo oModelPersona = new Odontologo();
		oModelPersona.setNombre(request.getParameter("txtNombre"));
		oModelPersona.setNum_documento(Integer.parseInt(request.getParameter("txtDNI")));
		oModelPersona.setApellido(request.getParameter("txtApellido"));
		oModelPersona.setCelular(Integer.parseInt(request.getParameter("txtTelefono")));
		oModelPersona.setMatricula(request.getParameter("txtMatricula"));
		oModelPersona.setEmail(request.getParameter("txtEmail"));
		String fecha = (request.getParameter("fecha"));
		oModelPersona.convertFechaTurno(fecha);

		try {
			gestionOdontologo.insertar(oModelPersona);

		} catch (Exception e) {
			System.out.println("registrarOdontologo" + e.getMessage());
			return new ModelAndView("/error", "mensaje", e.getMessage());
		}
		return new ModelAndView("listPaciente");
	}

}
