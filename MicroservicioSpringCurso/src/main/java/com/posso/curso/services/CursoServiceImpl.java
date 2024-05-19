package com.posso.curso.services;

import org.springframework.stereotype.Service;

import com.posso.common.usuario.models.entity.Curso;
import com.posso.commons.service.CommonService;
import com.posso.commons.service.CommonServiceImpl;
import com.posso.curso.repository.CursoRepository;

@Service
public class CursoServiceImpl extends CommonServiceImpl<Curso, CursoRepository>
implements CommonService<Curso>{

}
