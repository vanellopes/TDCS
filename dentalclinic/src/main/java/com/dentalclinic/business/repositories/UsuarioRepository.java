package com.dentalclinic.business.repositories;

import com.dentalclinic.business.entities.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	@Override
	Usuario save(Usuario usuario);

}
