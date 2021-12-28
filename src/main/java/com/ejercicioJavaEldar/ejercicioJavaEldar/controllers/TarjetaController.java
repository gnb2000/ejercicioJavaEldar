package com.ejercicioJavaEldar.ejercicioJavaEldar.controllers;

import com.ejercicioJavaEldar.ejercicioJavaEldar.dto.TarjetaDTO;
import com.ejercicioJavaEldar.ejercicioJavaEldar.models.Marca;
import com.ejercicioJavaEldar.ejercicioJavaEldar.models.Tarjeta;
import com.ejercicioJavaEldar.ejercicioJavaEldar.repo.MarcaRepository;
import com.ejercicioJavaEldar.ejercicioJavaEldar.services.MarcaService;
import com.ejercicioJavaEldar.ejercicioJavaEldar.services.TarjetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class TarjetaController {

    @Autowired
    private TarjetaService tarjetaService;

    @Autowired
    private MarcaService marcaService;

    public void crearTarjeta(int marca_id,int nroTarjeta,String cardHolder, LocalDate fechaVenc) throws Exception {
        Marca marca = marcaService.getMarcaById(marca_id);
        Tarjeta tarjeta = new Tarjeta(marca,nroTarjeta,cardHolder,fechaVenc);
        tarjetaService.save(tarjeta);
    }

    public TarjetaDTO getTarjetaDTOByNroTarjeta(int nroTarjeta) throws Exception {
        return tarjetaService.findByNroTarjeta(nroTarjeta).toDTO();
    }

    public boolean isValida(int nroTarjeta) throws Exception {
        Tarjeta tarjeta = tarjetaService.findByNroTarjeta(nroTarjeta);
        return tarjeta.isValida();
    }

    public boolean sonTarjetasIguales(int nroTarjeta1,int nroTarjeta2) throws Exception {
        Tarjeta tarjeta1 = tarjetaService.findByNroTarjeta(nroTarjeta1);
        Tarjeta tarjeta2 = tarjetaService.findByNroTarjeta(nroTarjeta2);
        return tarjeta1.soyEsaTarjeta(tarjeta2);
    }

    @ExceptionHandler()
    public String handleException(Exception e){
        return e.getMessage();
    }
}
