package com.posso.microserviciorespuesta.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.posso.common.usuario.models.entity.Examen;
import com.posso.microserviciorespuesta.repository.ExamenRepository;

@Service
public class ExamenServiceImpl implements ExamenService {

	@Autowired
	ExamenRepository dao;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Examen> findAll() {
		return dao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Examen> findById(Long Id) {
		return dao.findById(Id);
	}

	@Override
	@Transactional
	public Examen save(Examen examen) {
		return dao.save(examen);
	}

	@Override
	@Transactional
	public void deleteById(Long Id) {
		dao.deleteById(Id);
		
	}

}
