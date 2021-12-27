package com.ejercicioJavaEldar.ejercicioJavaEldar.controllers;

import com.ejercicioJavaEldar.ejercicioJavaEldar.dto.OperacionDTO;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestOperacionController {

    @RequestMapping("/tasaOperacion")
    public OperacionDTO getTarjetaAndImporteByOperacion() throws Exception {
        //System.out.println(Controller.getInstancia().getTasaMarcaImporteByOperacion(0).getImporte());
        return Controller.getInstancia().getTasaMarcaImporteByOperacion(0);
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hola";
    }

    @ExceptionHandler()
    public String handleException(Exception e){
        return e.getMessage();
    }
}
