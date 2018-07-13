package com.dobarco.repository;

import org.springframework.data.repository.CrudRepository;

import com.dobarco.models.Convidado;
import com.dobarco.models.Evento;
//Repositorio para manipulação do Database
public interface ConvidadoRepository extends CrudRepository<Convidado, String>{
	Iterable<Convidado> findByEvento(Evento evento);
}
