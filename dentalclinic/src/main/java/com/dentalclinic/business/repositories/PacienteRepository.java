package com.dentalclinic.business.repositories;

import com.dentalclinic.business.entities.Paciente;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface PacienteRepository extends CrudRepository<Paciente, Integer> {

	@Query("SELECT o FROM Paciente o")
	List<Paciente> listPacientes();

	@SuppressWarnings("unchecked")
	@Override
	Paciente save(Paciente oModelPersona);

}
