package com.ejercicioJavaEldar.ejercicioJavaEldar.controllers;

import com.ejercicioJavaEldar.ejercicioJavaEldar.dto.OperacionDTO;
import com.ejercicioJavaEldar.ejercicioJavaEldar.services.OperacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControladorRest {

    @Autowired
    private OperacionService operacionService;

    private static ControladorRest instancia;

    private ControladorRest() throws Exception {};

    public static ControladorRest getInstancia() throws Exception {
        if (instancia == null){
            instancia = new ControladorRest();
        }
        return instancia;
    }

    @RequestMapping("/operacion/{id}")
    public OperacionDTO getOperacionById(@PathVariable int id) throws Exception {
        return operacionService.getOperacionById(id).toDTO();
    }

    @ExceptionHandler()
    public String handleException(Exception e){
        return e.getMessage();
    }
}
