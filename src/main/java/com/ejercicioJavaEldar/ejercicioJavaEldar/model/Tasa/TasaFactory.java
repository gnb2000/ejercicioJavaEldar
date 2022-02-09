package com.ejercicioJavaEldar.ejercicioJavaEldar.model.Tasa;

public class TasaFactory {

    //Patron de diseño: Factory

    public static Tasa getTasa(String nombre_marca){
        switch (nombre_marca){
            case "VISA":
                return new TasaVisa();
            case "NARA":
                return new TasaNara();
            case "AMEX":
                return new TasaAmex();
            default:
                System.out.println("No existe una marca con el nombre "+nombre_marca);
                return null;
        }
    }
}
