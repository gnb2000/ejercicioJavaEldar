package com.ejercicioJavaEldar.ejercicioJavaEldar.dto;

public class MarcaDTO {

    private int id;
    private String nombre;
    private float tasa;

    public MarcaDTO(int id,String nombre, float tasa) {
        this.id = id;
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

    @Override
    public String toString() {
        return "MarcaDTO{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tasa=" + tasa +
                '}';
    }
}
