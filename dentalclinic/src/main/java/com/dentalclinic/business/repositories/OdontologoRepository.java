package com.dentalclinic.business.repositories;

import com.dentalclinic.business.entities.Odontologo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface OdontologoRepository extends JpaRepository<Odontologo, Integer> {

	@Query("SELECT o FROM Odontologo o")
	List<Odontologo> listOdontologos();

	@SuppressWarnings("unchecked")
	@Override
	Odontologo save(Odontologo oModelPersona);

}
