package com.dentalclinic.web.controller;

import com.dentalclinic.business.services.GestionPaciente;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PacienteController {
	
	protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired
    private GestionPaciente gestionPaciente;
    
    @RequestMapping(value="/registroPaciente")
    public ModelAndView registroPaciente() {
        String now = (new Date()).toString();
        logger.info("Returning hello view with " + now);

        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("now", now);
        myModel.put("pacientes", this.gestionPaciente.listarPacientes());

        return new ModelAndView("listPaciente", "model", myModel);
    }
    
    @RequestMapping(value="/listarPacientes")
    public ModelAndView listarPacientes() {
        String now = (new Date()).toString();
        logger.info("Returning hello view with " + now);

        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("now", now);
        myModel.put("pacientes", this.gestionPaciente.listarPacientes());

        return new ModelAndView("listPaciente", "model", myModel);
    }
    
    @RequestMapping(value="/paciente.htm")
    public ModelAndView handleRequest() {
        String now = (new Date()).toString();
        logger.info("Returning hello view with " + now);

        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("now", now);
        myModel.put("pacientes", this.gestionPaciente.listarPacientes());

        return new ModelAndView("listPaciente", "model", myModel);
    }
    
    
    

}
