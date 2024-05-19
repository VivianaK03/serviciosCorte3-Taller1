package com.posso.microserviciorespuesta.service;

import com.posso.common.usuario.models.entity.Examen;
import com.posso.commons.service.CommonService;

public interface ExamenService extends CommonService<Examen>{

		public Examen save(Examen examen);
		public void deleteById(Long Id);


}
