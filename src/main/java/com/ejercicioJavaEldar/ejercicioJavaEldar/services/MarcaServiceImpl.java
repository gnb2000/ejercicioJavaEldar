package com.ejercicioJavaEldar.ejercicioJavaEldar.services;

import com.ejercicioJavaEldar.ejercicioJavaEldar.models.Marca;
import com.ejercicioJavaEldar.ejercicioJavaEldar.repo.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MarcaServiceImpl implements MarcaService{

    @Autowired
    private MarcaRepository marcaRepository;

    @Override
    public void save(Marca marca) {
        marcaRepository.save(marca);
    }

    @Override
    public Marca getMarcaById(int marca_id) throws Exception {
       Optional<Marca> marca = marcaRepository.findById(marca_id);
       if (marca.isPresent()){
           return marca.get();
       } else {
           throw new Exception("No existe una marca con id "+marca_id);
       }
    }
}
