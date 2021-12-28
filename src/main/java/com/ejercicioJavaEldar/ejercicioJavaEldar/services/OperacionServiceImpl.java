package com.ejercicioJavaEldar.ejercicioJavaEldar.services;

import com.ejercicioJavaEldar.ejercicioJavaEldar.models.Marca;
import com.ejercicioJavaEldar.ejercicioJavaEldar.models.Operacion;
import com.ejercicioJavaEldar.ejercicioJavaEldar.repo.OperacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OperacionServiceImpl implements OperacionService{

    @Autowired
    private OperacionRepository operacionRepository;

    @Override
    public void save(Operacion o) {
        operacionRepository.save(o);
    }

    @Override
    public Operacion getOperacionById(int operacion_id) throws Exception {
        Optional<Operacion> operacion = operacionRepository.findById(operacion_id);
        if (operacion.isPresent()){
            return operacion.get();
        } else {
            throw new Exception("No existe una operacion con id "+operacion);
        }
    }
}
