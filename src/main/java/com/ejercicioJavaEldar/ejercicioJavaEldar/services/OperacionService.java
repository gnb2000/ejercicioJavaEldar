package com.ejercicioJavaEldar.ejercicioJavaEldar.services;

import com.ejercicioJavaEldar.ejercicioJavaEldar.models.Operacion;

public interface OperacionService {

    void save(Operacion o);
    Operacion getOperacionById(int id) throws Exception;
}
