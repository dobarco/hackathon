package com.dobarco.repository;

import org.springframework.data.repository.CrudRepository;
import com.dobarco.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String> {
	Evento findByCodigo(long codigo);
}
