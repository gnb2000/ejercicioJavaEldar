package com.ejercicioJavaEldar.ejercicioJavaEldar.models;

import com.ejercicioJavaEldar.ejercicioJavaEldar.dto.TarjetaDTO;

import java.time.LocalDate;

public class Tarjeta {

    private Marca marca;
    private int nroTarjeta;
    private String cardHolder;
    private LocalDate fechaVenc;

    public Tarjeta(Marca marca, int nroTarjeta, String cardHolder, LocalDate fechaVenc) {
        this.marca = marca;
        this.nroTarjeta = nroTarjeta;
        this.cardHolder = cardHolder;
        this.fechaVenc = fechaVenc;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
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
                "marca=" + marca +
                ", nroTarjeta=" + nroTarjeta +
                ", cardHolder='" + cardHolder + '\'' +
                ", fechaVenc=" + fechaVenc +
                '}';
    }

    public TarjetaDTO toDTO(){
        return new TarjetaDTO(this.marca.getNombre(),this.nroTarjeta,this.cardHolder,this.fechaVenc);
    }

    public boolean isValida(){
        if (this.fechaVenc.isAfter(LocalDate.now())){
            return true;
        } else {
            return false;
        }
    }

    public boolean soyEsaTarjeta(Tarjeta tarjeta){
        if (this.equals(tarjeta)){
            return true;
        } else {
            return false;
        }
    }


}
