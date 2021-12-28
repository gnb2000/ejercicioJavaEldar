package com.ejercicioJavaEldar.ejercicioJavaEldar.services;

import com.ejercicioJavaEldar.ejercicioJavaEldar.models.Marca;
import com.ejercicioJavaEldar.ejercicioJavaEldar.models.Tarjeta;
import com.ejercicioJavaEldar.ejercicioJavaEldar.repo.TarjetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TarjetaServiceImpl implements TarjetaService{

    @Autowired
    private TarjetaRepository tarjetaRepository;

    @Override
    public void save(Tarjeta t) {
        tarjetaRepository.save(t);
    }

    @Override
    public Tarjeta findByNroTarjeta(int nroTarjeta) throws Exception {
        Optional<Tarjeta> tarjeta = tarjetaRepository.findById(nroTarjeta);
        if (tarjeta.isPresent()){
            return tarjeta.get();
        } else {
            throw new Exception("No existe una tarjeta con Nro Tarjeta "+nroTarjeta);
        }
    }
}
