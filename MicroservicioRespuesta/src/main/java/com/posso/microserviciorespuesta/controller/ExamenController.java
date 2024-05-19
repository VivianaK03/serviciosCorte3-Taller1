package com.posso.microserviciorespuesta.controller;

import org.springframework.web.bind.annotation.RestController;

import com.posso.common.usuario.models.entity.Examen;
import com.posso.commons.controller.CommonController;
import com.posso.microserviciorespuesta.service.ExamenService;

@RestController
public class ExamenController extends CommonController<Examen, ExamenService>{


}
