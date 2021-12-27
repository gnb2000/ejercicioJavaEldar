package com.ejercicioJavaEldar.ejercicioJavaEldar.models;

import com.ejercicioJavaEldar.ejercicioJavaEldar.dto.MarcaDTO;

public class Marca {

    private static int idStatic = 0;
    private int id;
    private String nombre;
    private float tasa;

    public Marca(String nombre, float tasa) {
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

    public float getTasa() {
        return tasa;
    }

    public void setTasa(float tasa) {
        this.tasa = tasa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MarcaDTO toDTO(){
        return new MarcaDTO(this.id,this.nombre,this.tasa);
    }

    @Override
    public String toString() {
        return "Marca{" +
                "nombre='" + nombre + '\'' +
                ", tasa=" + tasa +
                '}';
    }
}
