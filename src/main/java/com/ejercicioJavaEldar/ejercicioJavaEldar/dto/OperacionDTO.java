package com.ejercicioJavaEldar.ejercicioJavaEldar.dto;

import com.ejercicioJavaEldar.ejercicioJavaEldar.models.Tarjeta;

import java.time.LocalDate;

public class OperacionDTO {

    private int id;
    private int nroTarjeta;
    private float importe;
    private LocalDate fecha;

    public OperacionDTO(int id, int nroTarjeta, float importe, LocalDate fecha) {
        this.id = id;
        this.nroTarjeta = nroTarjeta;
        this.importe = importe;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTarjeta_id() {
        return nroTarjeta;
    }

    public void setTarjeta_id(int tarjeta_id) {
        this.nroTarjeta = tarjeta_id;
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

    @Override
    public String toString() {
        return "OperacionDTO{" +
                "id=" + id +
                ", tarjeta_id=" + nroTarjeta +
                ", importe=" + importe +
                ", fecha=" + fecha +
                '}';
    }
}
