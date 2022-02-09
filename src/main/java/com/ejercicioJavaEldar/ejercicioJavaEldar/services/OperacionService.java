package com.ejercicioJavaEldar.ejercicioJavaEldar.services;

import com.ejercicioJavaEldar.ejercicioJavaEldar.model.entities.Operacion;

public interface OperacionService {

    void save(Operacion o);
    Operacion getOperacionById(int id) throws Exception;
}
