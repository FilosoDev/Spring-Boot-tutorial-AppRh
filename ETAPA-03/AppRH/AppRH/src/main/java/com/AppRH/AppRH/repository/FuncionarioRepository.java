package com.AppRH.AppRH.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.AppRH.AppRH.models.Funcionario;

public interface FuncionarioRepository extends CrudRepository<Funcionario, String>{
	
	Funcionario findById(long id);
	
	// busca
	Funcionario findByNome(String nome);
	
	// para a busca
	@Query(value = "select u from Funcionario u where u.nome like %?1%")
	List<Funcionario>findByNomes(String nome);

}
