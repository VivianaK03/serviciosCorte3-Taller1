package com.posso.microserviciorespuesta.repository;

import org.springframework.data.repository.CrudRepository;

import com.posso.common.usuario.models.entity.Examen;

public interface ExamenRepository extends CrudRepository<Examen, Long> {

}
