package com.ejercicioJavaEldar.ejercicioJavaEldar.controllers;

import com.ejercicioJavaEldar.ejercicioJavaEldar.dto.OperacionDTO;
import com.ejercicioJavaEldar.ejercicioJavaEldar.model.entities.Operacion;
import com.ejercicioJavaEldar.ejercicioJavaEldar.model.entities.Tarjeta;
import com.ejercicioJavaEldar.ejercicioJavaEldar.services.OperacionService;
import com.ejercicioJavaEldar.ejercicioJavaEldar.services.TarjetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
public class OperacionController {

    @Autowired
    private OperacionService operacionService;

    @Autowired
    private TarjetaService tarjetaService;

    @RequestMapping("/operacion")
    public OperacionDTO getOperacionByIdREST(@RequestBody Operacion o) throws Exception {
        return operacionService.getOperacionById(o.getId()).toDTO();
    }

    public OperacionDTO getOperacionById(int id) throws Exception {
        return operacionService.getOperacionById(id).toDTO();
    }

    public void crearOperacion(int nroTarjeta, float importe) throws Exception {
        Tarjeta tarjeta = tarjetaService.findByNroTarjeta(nroTarjeta);
        Operacion operacion = new Operacion(tarjeta,importe, LocalDate.now());
        operacionService.save(operacion);
    }

    public boolean isOperacionValida(int operacion_id) throws Exception {
        Operacion operacion = operacionService.getOperacionById(operacion_id);
        return operacion.isValida();
    }

    @ExceptionHandler()
    public String handleException(Exception e){
        return e.getMessage();
    }
}
