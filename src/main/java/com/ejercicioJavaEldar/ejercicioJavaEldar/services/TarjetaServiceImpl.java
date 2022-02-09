package com.ejercicioJavaEldar.ejercicioJavaEldar.services;

import com.ejercicioJavaEldar.ejercicioJavaEldar.client.UserServiceClient;
import com.ejercicioJavaEldar.ejercicioJavaEldar.model.entities.Tarjeta;
import com.ejercicioJavaEldar.ejercicioJavaEldar.repo.TarjetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TarjetaServiceImpl implements TarjetaService{

    @Autowired
    private TarjetaRepository tarjetaRepository;

    @Autowired
    private UserServiceClient userService;

    @Override
    public void save(Tarjeta t) {
        if (userService.existeUsuarioByCardHolder(t.getCardHolder())){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
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
