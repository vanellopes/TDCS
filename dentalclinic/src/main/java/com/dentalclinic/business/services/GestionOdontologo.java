package com.dentalclinic.business.services;

import com.dentalclinic.business.entities.Odontologo;

import java.util.List;

public interface GestionOdontologo {
	
    public void registrarOdontologo(Odontologo odontologo);
    
    public List<Odontologo> listarOdontologos();

}
