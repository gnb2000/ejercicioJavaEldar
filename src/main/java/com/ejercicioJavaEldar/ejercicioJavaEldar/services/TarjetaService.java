package com.ejercicioJavaEldar.ejercicioJavaEldar.services;

import com.ejercicioJavaEldar.ejercicioJavaEldar.models.Tarjeta;

public interface TarjetaService {

    void save(Tarjeta t);
    Tarjeta findByNroTarjeta(int nroTarjeta) throws Exception;
}
