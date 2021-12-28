package com.ejercicioJavaEldar.ejercicioJavaEldar.models.Tasa;

import java.time.LocalDate;

public class TasaNara implements Tasa{

    @Override
    public float calcularTasa(LocalDate fecha) {
        return (float) (fecha.getDayOfMonth() / 0.5);
    }
}
