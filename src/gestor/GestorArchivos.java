/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestor;

import enumerados.EstadoVisibilidad;
import enumerados.TipoArchivo;
import java.util.ArrayList;
import java.util.Date;
import modelo.Archivo;

/**
 *
 * @author matia
 */
public class GestorArchivos {
    
    
   public Archivo crearArchivo(String nombre, TipoArchivo tipo, double tamanioBytes){
       Archivo nuevoArchivo = new Archivo(nombre,tipo,tamanioBytes);
       return nuevoArchivo;
   }
   /*Aca iria logica de eliminar archivo*/
   public void  eliminarArchivo(Archivo archivo){
       
   }
   /*Aca iria logica de modificar archivo y evaluar espacio*/
   public void modificarArchivo(Archivo archivo,String nombreNuevo, TipoArchivo tipoNuevo, double tamanioNuevo){
      
   }
   /*Aca iria logica de copiar archivo y evaluar espacio*/
    public Archivo copiarArchivo(Archivo archivo){
       Archivo copiaArchivo = archivo;
       return copiaArchivo;
   }
   /*Aca iria logica filtrado y mostrar por nombre*/
   public ArrayList<Archivo>  buscarArchivosPorNombre(String nombre){
       ArrayList listaArchivo = new ArrayList();
       return listaArchivo;
   } 
   /*Aca iria logica filtrado y mostrar por tipo*/
   public ArrayList<Archivo> buscarArchivosPorTipo(TipoArchivo tipo ){
       ArrayList listaArchivo = new ArrayList();
       return listaArchivo;
   }
   /*Aca iria logica de filtrado y mostrar por fecha*/
    public ArrayList<Archivo> buscarArchivosPorFecha(Date fecha ){
       ArrayList listaArchivo = new ArrayList();
       return listaArchivo; 
   }
    /*Aca iria logica de listar*/
   public ArrayList<Archivo> listarArchivos(){
       return new ArrayList(); 
   } 
   /*Aca iria logica de cambiar visibilidad*/
   public void cambiarVisibilidad(Archivo archivo, EstadoVisibilidad estado){
       
   }
   /*Aca me parece que tenga que retornar un boolean si es una consula 
   tiene que devolver info ej. Espacio disponible 4Gb*/
   public boolean consultarEspacioDisponible(double tamanioRequerido){
       return true;
   } 
}
