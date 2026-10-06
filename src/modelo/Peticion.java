/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import enumerados.EstadoPeticion;
import enumerados.TipoPeticion;
import java.util.Date;

/**
 *
 * @author matia
 */
public class Peticion {
   private final TipoPeticion tipo;
   private EstadoPeticion estado;
   private final Date fecha;
   private final Archivo archivo;

    public Peticion(TipoPeticion tipo, Archivo archivo) {
        this.tipo = tipo;
        this.estado = EstadoPeticion.EN_ESPERA;
        this.archivo = archivo;
        this.fecha = new Date();
        
    }

    public Archivo getArchivo() {
        return archivo;
    }

    public TipoPeticion getTipo() {
        return this.tipo;
    }

    public EstadoPeticion getEstado() {
        return this.estado;
    }

    public Date getFecha() {
        return this.fecha;
    }
   
   
   
    public void  actualizarEstado(EstadoPeticion nuevoEstado ){
       this.estado = nuevoEstado;
   }
}
