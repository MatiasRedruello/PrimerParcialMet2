/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import enumerados.TipoPeticion;
/**
 *
 * @author matia
 */
public class Usuario {
   private int idUsuario;
   private String nombre;

    public Usuario(int idUsuario, String nombre) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
   
   public Peticion iniciarPeticion(TipoPeticion tipo, Archivo archivo){
       Peticion nuevaPeticion = new Peticion(tipo,archivo);
       return nuevaPeticion;
   }
}
