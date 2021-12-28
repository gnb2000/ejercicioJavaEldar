package com.ejercicioJavaEldar.ejercicioJavaEldar.models;

import com.ejercicioJavaEldar.ejercicioJavaEldar.dto.OperacionDTO;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="operaciones")
public class Operacion {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne()
    @JoinColumn(name = "tarjeta_id")
    private Tarjeta tarjeta;
    private float importe;
    private LocalDate fecha;

    public Operacion(){}

    public Operacion(Tarjeta tarjeta, float importe, LocalDate fecha) {
        this.tarjeta = tarjeta;
        this.importe = importe;
        this.fecha = fecha;
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
        return new OperacionDTO(this.id,this.tarjeta.getMarca().getNombre(),this.importe,this.fecha,this.getTarjeta().getMarca().calcularTasa());
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
