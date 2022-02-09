package com.ejercicioJavaEldar.ejercicioJavaEldar.repo;

import com.ejercicioJavaEldar.ejercicioJavaEldar.model.entities.Operacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperacionRepository extends JpaRepository<Operacion, Integer> {
}
