package com.ejercicioJavaEldar.ejercicioJavaEldar.repo;

import com.ejercicioJavaEldar.ejercicioJavaEldar.models.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MarcaRepository extends JpaRepository<Marca,Integer> {

}
