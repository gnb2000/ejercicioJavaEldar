package com.ejercicioJavaEldar.ejercicioJavaEldar.services;

import com.ejercicioJavaEldar.ejercicioJavaEldar.models.Operacion;
import com.ejercicioJavaEldar.ejercicioJavaEldar.repo.DataRepo;
import com.ejercicioJavaEldar.ejercicioJavaEldar.repo.OperacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperacionServiceImpl implements OperacionService{

    @Autowired
    private DataRepo dataRepo;

    @Autowired
    private OperacionRepository operacionRepository;

    @Override
    public void save(Operacion o) {
        operacionRepository.save(o);
    }

    @Override
    public Operacion getOperacionById(int operacion_id) throws Exception {
        for (Operacion operacion : dataRepo.getAllOperaciones()){
            if (operacion.getId() == operacion_id){
                return operacion;
            }
        }
        throw new Exception("No existe una operacion con id "+operacion_id);
    }
}
