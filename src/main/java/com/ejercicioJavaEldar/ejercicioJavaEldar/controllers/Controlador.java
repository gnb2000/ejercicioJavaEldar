package com.ejercicioJavaEldar.ejercicioJavaEldar.controllers;

import com.ejercicioJavaEldar.ejercicioJavaEldar.dto.OperacionDTO;
import com.ejercicioJavaEldar.ejercicioJavaEldar.dto.TarjetaDTO;
import com.ejercicioJavaEldar.ejercicioJavaEldar.models.Marca;
import com.ejercicioJavaEldar.ejercicioJavaEldar.models.Operacion;
import com.ejercicioJavaEldar.ejercicioJavaEldar.models.Tarjeta;
import com.ejercicioJavaEldar.ejercicioJavaEldar.models.Tasa.Tasa;
import com.ejercicioJavaEldar.ejercicioJavaEldar.models.Tasa.TasaFactory;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Controlador {

    private static Controlador instancia;
    private List<Tarjeta> tarjetas = new ArrayList<Tarjeta>();
    private List<Marca> marcas = new ArrayList<Marca>();
    private List<Operacion> operaciones = new ArrayList<Operacion>();

    private Controlador() {};

    public static Controlador getInstancia() throws Exception {
        if (instancia == null){
            instancia = new Controlador();
        }
        return instancia;
    }

    public void crearMarca(String nombre, String nombre_marca){
        Tasa tasa = TasaFactory.getTasa(nombre_marca);
        Marca marca = new Marca(nombre,tasa);
        marcas.add(marca);
    }

    public void crearTarjeta(int marca_id,int nroTarjeta,String cardHolder, LocalDate fechaVenc) throws Exception {
        Marca marca = this.getMarcaById(marca_id);
        Tarjeta tarjeta = new Tarjeta(marca,nroTarjeta,cardHolder,fechaVenc);
        tarjetas.add(tarjeta);
    }

    public void crearOperacion(int nroTarjeta, float importe) throws Exception {
        Tarjeta tarjeta = this.getTarjetaByNroTarjeta(nroTarjeta);
        Operacion operacion = new Operacion(tarjeta,importe,LocalDate.now());
        operaciones.add(operacion);
    }

    public TarjetaDTO getTarjetaDTOByNroTarjeta(int nroTarjeta) throws Exception {
        for (Tarjeta tarjeta : tarjetas){
            if (tarjeta.getNroTarjeta() == nroTarjeta){
                return tarjeta.toDTO();
            }
        }
        throw new Exception("No existe una tarjeta con numero de tarjeta: "+nroTarjeta);
    }

    public boolean isValida(int nroTarjeta) throws Exception {
        Tarjeta tarjeta = this.getTarjetaByNroTarjeta(nroTarjeta);
        return tarjeta.isValida();
    }

    public boolean sonTarjetasIguales(int nroTarjeta1,int nroTarjeta2) throws Exception {
        Tarjeta tarjeta1 = this.getTarjetaByNroTarjeta(nroTarjeta1);
        Tarjeta tarjeta2 = this.getTarjetaByNroTarjeta(nroTarjeta2);
        return tarjeta1.soyEsaTarjeta(tarjeta2);
    }

    public boolean isOperacionValida(int operacion_id) throws Exception {
        Operacion operacion = this.getOperacionById(operacion_id);
        return operacion.isValida();
    }

    public OperacionDTO getTasaMarcaImporteByOperacion(int operacion_id) throws Exception {
        Operacion operacion = this.getOperacionById(operacion_id);
        return operacion.toDTO();
    }



    private Marca getMarcaById(int id) throws Exception {
        for (Marca marca : marcas){
            if (marca.getId() == id){
                return marca;
            }
        }
        throw new Exception("No existe una marca con id: "+id);
    }

    private Tarjeta getTarjetaByNroTarjeta(int nroTarjeta) throws Exception {
        for (Tarjeta tarjeta : tarjetas){
            if (tarjeta.getNroTarjeta() == nroTarjeta){
                return tarjeta;
            }
        }
        throw new Exception("No existe una tarjeta con numero de tarjeta: "+nroTarjeta);
    }

    private Operacion getOperacionById(int operacion_id) throws Exception {
        for (Operacion operacion : operaciones){
            if (operacion.getId() == operacion_id){
                return operacion;
            }
        }
        throw new Exception("No existe una operacion con id "+operacion_id);
    }
}
