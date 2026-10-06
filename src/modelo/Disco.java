/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import interfaces.Almacenable;

/**
 *
 * @author matia
 */
public class Disco {
   private double espacioTotal;
   private double espacioDisponible ;

    public Disco(double espacioTotal, double espacioDisponible) {
        this.espacioTotal = espacioTotal;
        this.espacioDisponible = espacioDisponible;
    }


    private void setEspacioDisponible(double espacioDisponible) {
        this.espacioDisponible = espacioDisponible;
    }
           
   public boolean validarEspacioDisponible(double tamanioRequerido ){
       return this.espacioDisponible <= tamanioRequerido;
   }
   
   public void  almacenarArchivo(Almacenable archivo){
       boolean validacion = this.validarEspacioDisponible(archivo.obtenerTamanioBytes());
       
       if(validacion){
           notificarDisponibilidadEspacio(validacion);
           setEspacioDisponible(archivo.obtenerTamanioBytes());
       }
       else notificarDisponibilidadEspacio(validacion);
       
   }
   
   public void notificarDisponibilidadEspacio( boolean espacioDisponible){
       String mensaje = "";
       if(espacioDisponible){
           mensaje = "Espacio disponible";
       }else mensaje = "Espacio insuficiente";
       
       System.out.println(mensaje);
       
   }
}
