package com.ejercicioJavaEldar.ejercicioJavaEldar.repo;

import com.ejercicioJavaEldar.ejercicioJavaEldar.models.Marca;
import com.ejercicioJavaEldar.ejercicioJavaEldar.models.Operacion;
import com.ejercicioJavaEldar.ejercicioJavaEldar.models.Tarjeta;
import com.ejercicioJavaEldar.ejercicioJavaEldar.models.Tasa.TasaFactory;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class DataRepo {

    private List<Marca> marcas = new ArrayList<Marca>(
            Arrays.asList(
                    new Marca("VISA", TasaFactory.getTasa("VISA").calcularTasa(LocalDate.now())),
                    new Marca("NARA", TasaFactory.getTasa("NARA").calcularTasa(LocalDate.now())),
                    new Marca("AMEX", TasaFactory.getTasa("AMEX").calcularTasa(LocalDate.now()))
            )
    );

    private List<Tarjeta> tarjetas = new ArrayList<Tarjeta>(
            Arrays.asList(new Tarjeta(this.getMarcaById(0),1,"Jorge Perez", LocalDate.of(2021,12,28)),
                    new Tarjeta(this.getMarcaById(1),2,"Julian Lopez", LocalDate.of(2021,12,28)),
                    new Tarjeta(this.getMarcaById(2),3,"Ernesto Pereira", LocalDate.of(2021,12,24))
            ));

    private List<Operacion> operaciones = new ArrayList<Operacion>(
            Arrays.asList(
                    new Operacion(this.getTarjetaByNroTarjeta(1),500,LocalDate.now())
            )
    );


    private Marca getMarcaById(int id) {
        for (Marca marca : marcas){
            if (marca.getId() == id){
                return marca;
            }
        }
        return null;
    }

    private Tarjeta getTarjetaByNroTarjeta(int nroTarjeta) {
        for (Tarjeta tarjeta : tarjetas){
            if (tarjeta.getNroTarjeta() == nroTarjeta){
                return tarjeta;
            }
        }
        return null;
    }

    public List<Tarjeta> getAllTarjetas(){
        return this.tarjetas;
    }

    public List<Marca> getAllMarcas(){
        return this.marcas;
    }

    public List<Operacion> getAllOperaciones(){
        return this.operaciones;
    }


}
