package com.posso.curso.repository;

import org.springframework.data.repository.CrudRepository;

import com.posso.common.usuario.models.entity.Curso;

public interface CursoRepository extends CrudRepository<Curso, Long>{
	
}