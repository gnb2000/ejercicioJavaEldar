package com.ejercicioJavaEldar.ejercicioJavaEldar.services;

import com.ejercicioJavaEldar.ejercicioJavaEldar.models.Marca;

public interface MarcaService {

    void save(Marca marca);
    Marca getMarcaById(int marca_id) throws Exception;

}
