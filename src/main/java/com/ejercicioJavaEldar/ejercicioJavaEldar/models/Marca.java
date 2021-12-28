package com.ejercicioJavaEldar.ejercicioJavaEldar.models;

import com.ejercicioJavaEldar.ejercicioJavaEldar.dto.MarcaDTO;
import com.ejercicioJavaEldar.ejercicioJavaEldar.models.Tasa.Tasa;

import java.time.LocalDate;

public class Marca {

    private static int idStatic = 0;
    private int id;
    private String nombre;
    private Tasa tasa;

    public Marca(){};

    public Marca(String nombre, Tasa tasa) {
        this.id = idStatic;
        idStatic++;
        this.nombre = nombre;
        this.tasa = tasa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tasa getTasa() {
        return tasa;
    }

    public void setTasa(Tasa tasa) {
        this.tasa = tasa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MarcaDTO toDTO(){
        return new MarcaDTO(this.id,this.nombre,this.tasa.calcularTasa(LocalDate.now()));
    }

    @Override
    public String toString() {
        return "Marca{" +
                "nombre='" + nombre + '\'' +
                ", tasa=" + tasa +
                '}';
    }
}
