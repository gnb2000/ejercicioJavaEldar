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
            this.testCrearOperacion();

            System.out.println("Item 1");
            this.testGetTarjetaByNroTarjeta();
            System.out.println("------------------------------------------");

            System.out.println("Item 2");
            this.testIsOperacionValida();
            System.out.println("------------------------------------------");

            System.out.println("Item 3");
            this.testIsTarjetaValida();
            System.out.println("------------------------------------------");

            System.out.println("Item 4");
            this.testSonTarjetasIguales();
            System.out.println("------------------------------------------");

            System.out.println("Item 5");
            this.testGetTasaMarcaImporteByOperacion();
            System.out.println("------------------------------------------");

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void testCrearMarca(){
        Controller.getInstancia().crearMarca("VISA", "VISA");
        Controller.getInstancia().crearMarca("NARA", "NARA");
        Controller.getInstancia().crearMarca("AMEX", "AMEX");
    }

    public void testCrearTarjeta(){
        try {
            Controller.getInstancia().crearTarjeta(0,1,"Jorge Perez", LocalDate.of(2021,12,28));
            Controller.getInstancia().crearTarjeta(1,2,"Julian Lopez", LocalDate.of(2021,12,28));
            Controller.getInstancia().crearTarjeta(2,3,"Ernesto Pereira", LocalDate.of(2021,12,24));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void testCrearOperacion(){
        try {
            Controller.getInstancia().crearOperacion(1,500);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void testGetTarjetaByNroTarjeta(){
        try {
            TarjetaDTO tarjeta = Controller.getInstancia().getTarjetaDTOByNroTarjeta(1);
            System.out.println(tarjeta.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void testIsTarjetaValida(){
        try {
            if (Controller.getInstancia().isValida(3)){
                System.out.println("La tarjeta esta valida para operar");
            } else {
                System.out.println("La tarjeta NO esta valida para operar");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void testSonTarjetasIguales(){
        try {
            if (Controller.getInstancia().sonTarjetasIguales(1,2)){
                System.out.println("Son tarjetas iguales");
            } else {
                System.out.println("Son tarjetas diferentes");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void testIsOperacionValida(){
        try {
            if (Controller.getInstancia().isOperacionValida(0)){
                System.out.println("La operacion es valida");
            } else {
                System.out.println("La operacion NO es valida");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void testGetTasaMarcaImporteByOperacion(){
        try {
            Controller.getInstancia().getTasaMarcaImporteByOperacion(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




}
