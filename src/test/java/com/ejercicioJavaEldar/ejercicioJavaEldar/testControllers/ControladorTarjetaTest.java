package com.ejercicioJavaEldar.ejercicioJavaEldar.testControllers;

import com.ejercicioJavaEldar.ejercicioJavaEldar.controllers.Controller;
import com.ejercicioJavaEldar.ejercicioJavaEldar.dto.TarjetaDTO;
import com.ejercicioJavaEldar.ejercicioJavaEldar.models.Marca;
import junit.framework.TestCase;

import java.time.LocalDate;

public class ControladorTarjetaTest extends TestCase {

    public void testPrincipal(){
        try{
            this.testCrearMarca();
            this.testCrearTarjeta();

            System.out.println("Item 1");
            this.testGetTarjetaByNroTarjeta();
            System.out.println("------------------------------------------");

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void testCrearMarca(){
        Controller.getInstancia().crearMarca("VISA", (float) 0.3);
        Controller.getInstancia().crearMarca("NARA", (float) 0.3);
        Controller.getInstancia().crearMarca("AMEX", (float) 0.3);
    }

    public void testCrearTarjeta(){
        try {
            Controller.getInstancia().crearTarjeta(0,1,"Jorge Perez", LocalDate.of(2021,12,28));
            Controller.getInstancia().crearTarjeta(1,2,"Julian Lopez", LocalDate.of(2021,12,28));
            Controller.getInstancia().crearTarjeta(2,3,"Ernesto Pereira", LocalDate.of(2021,12,28));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void testGetTarjetaByNroTarjeta(){
        try {
            TarjetaDTO tarjeta = Controller.getInstancia().getTarjetaByNroTarjeta(1);
            System.out.println(tarjeta.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void testGetMarcaById(){
        try{
            Marca marca = Controller.getInstancia().getMarcaById(1);
            System.out.println(marca.getNombre());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
