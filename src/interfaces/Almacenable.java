/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;
import  enumerados.TipoArchivo;
/**
 *
 * @author matia
 */
public interface Almacenable {
    double obtenerTamanioBytes();
    String obtenerNombre();
    TipoArchivo obtenerTipo();
}
