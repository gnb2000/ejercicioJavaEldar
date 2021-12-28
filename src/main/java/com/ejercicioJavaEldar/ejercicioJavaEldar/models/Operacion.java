package com.ejercicioJavaEldar.ejercicioJavaEldar.models;

import com.ejercicioJavaEldar.ejercicioJavaEldar.dto.OperacionDTO;

import java.time.LocalDate;

public class Operacion {

    private static int numerador = 0;
    private int id;
    private Tarjeta tarjeta;
    private float importe;
    private LocalDate fecha;

    public Operacion(){}

    public Operacion(Tarjeta tarjeta, float importe, LocalDate fecha) {
        this.id = numerador;
        this.tarjeta = tarjeta;
        this.importe = importe;
        this.fecha = fecha;
        numerador++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
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

    public boolean isValida(){
        if (this.importe < 1000){
            return true;
        } else {
            return false;
        }
    }

    public OperacionDTO toDTO(){
        return new OperacionDTO(this.id,this.tarjeta.getMarca().getNombre(),this.importe,this.fecha,this.getTarjeta().getMarca().getTasa().calcularTasa(LocalDate.now()));
    }

    @Override
    public String toString() {
        return "Operacion{" +
                "id=" + id +
                ", tarjeta=" + tarjeta +
                ", importe=" + importe +
                ", fecha=" + fecha +
                '}';
    }
}
