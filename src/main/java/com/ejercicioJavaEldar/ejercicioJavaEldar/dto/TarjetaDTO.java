package com.ejercicioJavaEldar.ejercicioJavaEldar.dto;

import com.ejercicioJavaEldar.ejercicioJavaEldar.models.Marca;

import java.time.LocalDate;

public class TarjetaDTO {

    private String nombre;
    private int nroTarjeta;
    private String cardHolder;
    private LocalDate fechaVenc;

    public TarjetaDTO(String nombre, int nroTarjeta, String cardHolder, LocalDate fechaVenc) {
        this.nombre = nombre;
        this.nroTarjeta = nroTarjeta;
        this.cardHolder = cardHolder;
        this.fechaVenc = fechaVenc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroTarjeta() {
        return nroTarjeta;
    }

    public void setNroTarjeta(int nroTarjeta) {
        this.nroTarjeta = nroTarjeta;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public LocalDate getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaVenc(LocalDate fechaVenc) {
        this.fechaVenc = fechaVenc;
    }

    @Override
    public String toString() {
        return "Tarjeta{" +
                "nombre='" + nombre + '\'' +
                ", nroTarjeta=" + nroTarjeta +
                ", cardHolder='" + cardHolder + '\'' +
                ", fechaVenc=" + fechaVenc +
                '}';
    }
}
