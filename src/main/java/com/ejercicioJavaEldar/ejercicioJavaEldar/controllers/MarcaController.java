package com.ejercicioJavaEldar.ejercicioJavaEldar.controllers;

import com.ejercicioJavaEldar.ejercicioJavaEldar.model.entities.Marca;
import com.ejercicioJavaEldar.ejercicioJavaEldar.model.Tasa.Tasa;
import com.ejercicioJavaEldar.ejercicioJavaEldar.model.Tasa.TasaFactory;
import com.ejercicioJavaEldar.ejercicioJavaEldar.services.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class MarcaController {

    @Autowired
    private MarcaService marcaService;

    public void crearMarca(String nombre){
        Tasa tasa = TasaFactory.getTasa(nombre);
        Marca marca = new Marca(nombre,tasa.calcularTasa(LocalDate.now()));
        marcaService.save(marca);
    }

    @ExceptionHandler()
    public String handleException(Exception e){
        return e.getMessage();
    }
}
