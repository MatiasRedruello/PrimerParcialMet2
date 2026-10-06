/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import enumerados.EstadoVisibilidad;
import enumerados.TipoArchivo;
import interfaces.Almacenable;
import interfaces.Gestionable;
import java.util.Date;

/**
 *
 * @author matia
 */
public class Archivo implements Almacenable,Gestionable{
   private String nombre;
   private TipoArchivo tipo;
   private final double tamanioBytes;
   private final Date fechaCreacion;
   private EstadoVisibilidad visibilidad;

    public Archivo(String nombre, TipoArchivo tipo, double tamanioBytes) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.tamanioBytes = tamanioBytes;
        this.fechaCreacion = new Date();
        this.visibilidad = EstadoVisibilidad.OCULTO;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(TipoArchivo tipo) {
        this.tipo = tipo;
    }

    private void setVisibilidad(EstadoVisibilidad visibilidad) {
        this.visibilidad = visibilidad;
    }

   @Override
    public String getNombre() {
        return nombre;
    }

   @Override
    public TipoArchivo getTipo() {
        return tipo;
    }

   @Override
    public double getTamanioBytes() {
        return tamanioBytes;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public EstadoVisibilidad getVisibilidad() {
        return visibilidad;
    }
    
   @Override
    public void  cambiarVisibilidad(EstadoVisibilidad estado){
       setVisibilidad(estado);
   }

    @Override
    public double obtenerTamanioBytes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String obtenerNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public TipoArchivo obtenerTipo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
