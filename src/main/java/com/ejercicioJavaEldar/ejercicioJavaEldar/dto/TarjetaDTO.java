package com.ejercicioJavaEldar.ejercicioJavaEldar.dto;

import java.time.LocalDate;

public class TarjetaDTO {

    private String nombre;
    private int marca_id;
    private int nroTarjeta;
    private String cardHolder;
    private LocalDate fechaVenc;

    public TarjetaDTO(String nombre,int marca_id, int nroTarjeta, String cardHolder, LocalDate fechaVenc) {
        this.nombre = nombre;
        this.nroTarjeta = nroTarjeta;
        this.cardHolder = cardHolder;
        this.fechaVenc = fechaVenc;
        this.marca_id = marca_id;

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

    public int getMarca_id() {
        return marca_id;
    }

    public void setMarca_id(int marca_id) {
        this.marca_id = marca_id;
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
