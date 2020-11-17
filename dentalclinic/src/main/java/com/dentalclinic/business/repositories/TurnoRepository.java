package com.dentalclinic.business.repositories;

import com.dentalclinic.business.entities.Turno;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface TurnoRepository extends CrudRepository<Turno, Integer>{

}

