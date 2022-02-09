package com.ejercicioJavaEldar.ejercicioJavaEldar.model.entities;

import com.ejercicioJavaEldar.ejercicioJavaEldar.dto.MarcaDTO;
import com.ejercicioJavaEldar.ejercicioJavaEldar.model.Tasa.TasaFactory;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "marcas")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private float tasa;

    @OneToMany(mappedBy = "marca", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Tarjeta> tarjetas;

    public Marca(){};

    public Marca(String nombre, float tasa) {
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

    public float calcularTasa(){
        this.tasa = TasaFactory.getTasa(this.nombre).calcularTasa(LocalDate.now());
        return tasa;
    }

    public MarcaDTO toDTO(){
        return new MarcaDTO(this.id,this.nombre,tasa);
    }

    @Override
    public String toString() {
        return "Marca{" +
                "nombre='" + nombre + '\'' +
                ", tasa=" + tasa +
                '}';
    }
}
