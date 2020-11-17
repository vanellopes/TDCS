package com.dentalclinic.business.repositories;

import com.dentalclinic.business.entities.Odontologo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface OdontologoRepository extends JpaRepository<Odontologo, Integer>{

}

