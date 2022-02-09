package com.ejercicioJavaEldar.ejercicioJavaEldar.dto;

import java.time.LocalDate;

public class OperacionDTO {

    private int id;
    private String marca_tarjeta;
    private float importe;
    private LocalDate fecha;
    private float tasa;

    public OperacionDTO(int id, String marca_tarjeta, float importe, LocalDate fecha,float tasa) {
        this.id = id;
        this.marca_tarjeta = marca_tarjeta;
        this.importe = importe;
        this.fecha = fecha;
        this.tasa = tasa;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca_tarjeta() {
        return marca_tarjeta;
    }

    public void setMarca_tarjeta(String marca_tarjeta) {
        this.marca_tarjeta = marca_tarjeta;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public float getTasa() {
        return tasa;
    }

    public void setTasa(float tasa) {
        this.tasa = tasa;
    }

    @Override
    public String toString() {
        return "Operacion{" +
                "id=" + id +
                ", marca_tarjeta='" + marca_tarjeta + '\'' +
                ", importe=" + importe +
                ", fecha=" + fecha +
                ", tasa=" + tasa +
                '}';
    }
}
