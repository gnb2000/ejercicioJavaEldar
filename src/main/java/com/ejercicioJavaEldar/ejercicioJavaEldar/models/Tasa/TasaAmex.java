package com.ejercicioJavaEldar.ejercicioJavaEldar.models.Tasa;

import java.time.LocalDate;

public class TasaAmex implements Tasa{
    @Override
    public float calcularTasa(LocalDate fecha) {
        return (float) (fecha.getMonthValue() * 0.1);
    }
}
