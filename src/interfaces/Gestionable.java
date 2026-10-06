/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;
import enumerados.EstadoVisibilidad;
import enumerados.TipoArchivo;

/**
 *
 * @author matia
 */
public interface Gestionable {
   String getNombre();
   TipoArchivo getTipo(); 
   double getTamanioBytes(); 
   void cambiarVisibilidad(EstadoVisibilidad estado);
}
