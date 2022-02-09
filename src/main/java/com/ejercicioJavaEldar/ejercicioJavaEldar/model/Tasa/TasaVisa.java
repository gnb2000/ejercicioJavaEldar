package com.ejercicioJavaEldar.ejercicioJavaEldar.model.Tasa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TasaVisa implements Tasa{

    @Override
    public float calcularTasa(LocalDate fecha) {
        return Float.valueOf(DateTimeFormatter.ofPattern("yy").format(fecha)) / fecha.getMonthValue();
    }
}
