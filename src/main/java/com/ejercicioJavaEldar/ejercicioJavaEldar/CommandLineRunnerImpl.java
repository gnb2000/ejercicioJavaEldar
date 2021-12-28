package com.ejercicioJavaEldar.ejercicioJavaEldar;

import com.ejercicioJavaEldar.ejercicioJavaEldar.controllers.MarcaController;
import com.ejercicioJavaEldar.ejercicioJavaEldar.controllers.OperacionController;
import com.ejercicioJavaEldar.ejercicioJavaEldar.controllers.TarjetaController;
import com.ejercicioJavaEldar.ejercicioJavaEldar.dto.OperacionDTO;
import com.ejercicioJavaEldar.ejercicioJavaEldar.dto.TarjetaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {

    @Autowired
    private MarcaController marcaController;

    @Autowired
    private TarjetaController tarjetaController;

    @Autowired
    private OperacionController operacionController;

    @Override
    public void run(String... args) {
        try {
            marcaController.crearMarca("VISA");
            marcaController.crearMarca("NARA");
            marcaController.crearMarca("AMEX");

            tarjetaController.crearTarjeta(1,1,"Jorge Perez", LocalDate.of(2021,12,28));
            tarjetaController.crearTarjeta(2,2,"Julian Lopez", LocalDate.of(2021,12,28));
            tarjetaController.crearTarjeta(3,3,"Ernesto Pereira", LocalDate.of(2021,12,24));

            operacionController.crearOperacion(1,500);

            System.out.println("Item 1");
            TarjetaDTO tarjeta = tarjetaController.getTarjetaDTOByNroTarjeta(1);
            System.out.println(tarjeta.toString());
            System.out.println("------------------------------------------");

            System.out.println("Item 2");
            if (operacionController.isOperacionValida(1)){
                System.out.println("La operacion es valida");
            } else {
                System.out.println("La operacion NO es valida");
            }
            System.out.println("------------------------------------------");

            System.out.println("Item 3");
            if (tarjetaController.isValida(3)){
                System.out.println("La tarjeta esta valida para operar");
            } else {
                System.out.println("La tarjeta NO esta valida para operar");
            }
            System.out.println("------------------------------------------");

            System.out.println("Item 4");
            if (tarjetaController.sonTarjetasIguales(1,2)){
                System.out.println("Son tarjetas iguales");
            } else {
                System.out.println("Son tarjetas diferentes");
            }
            System.out.println("------------------------------------------");

            System.out.println("Item 5");
            OperacionDTO operacion = operacionController.getOperacionById(1);
            System.out.println("Operacion "+operacion.getId()+"\n"+
                    "Tasa: "+operacion.getTasa()+"\n"+
                    "Marca: "+operacion.getMarca_tarjeta()+"\n"+
                    "Importe: "+operacion.getImporte());
            System.out.println("------------------------------------------");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}



