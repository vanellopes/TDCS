package com.dentalclinic.business.repositories;

import com.dentalclinic.business.entities.Paciente;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface PacienteRepository extends CrudRepository<Paciente, Integer>{

}
