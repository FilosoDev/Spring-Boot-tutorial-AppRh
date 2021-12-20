package com.AppRH.AppRH.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.AppRH.AppRH.models.Dependentes;
import com.AppRH.AppRH.models.Funcionario;

public interface DependentesRepository extends CrudRepository<Dependentes, String> {

	Iterable<Dependentes> findByFuncionario(Funcionario funcionario);
	
	// pensando no método delete
	Dependentes findByCpf(String cpf);
	Dependentes findById(long id);
	
	// criado para implementar
	List<Dependentes> findByNome(String nome);
	
}
