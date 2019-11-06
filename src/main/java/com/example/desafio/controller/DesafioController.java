package com.example.desafio.controller;

import com.example.desafio.entity.DesafioResponse;
import com.example.desafio.service.DesafioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;


@RestController
@Api(value = "Servicios para obtener las fechas faltantes de la consulta del servicio GDD", description = "Servicios para obtener las fechas faltantes de la consulta del servicio GDD" )
public class DesafioController {

@Autowired
    private DesafioService desafioService;

    @GetMapping("desafio")
    @ApiOperation(value = "",
                  notes = "")
    public DesafioResponse getToken() {
        DesafioResponse desafioResponse;
        desafioResponse = desafioService.buscarFechaFaltantes();
        return desafioResponse;
    }

}