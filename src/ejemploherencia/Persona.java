/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploherencia;

/**
 *
 * @author quique
 */
public class Persona {
    
    private String nombre;
    public String apellido;
    private int edad;
    
    
    public Persona (String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido= apellido;
        this.edad = edad;
    
    }
    
    public String getNombre(){
       
        return nombre;
    }
    
    public String getApellido(){
        
        return apellido;    
    }
    
    public int getEdad(){
        
        return edad;
    }

    @Override
    public String toString() {
        return ", Nombre= " + nombre + ", Apellido= " + apellido + ", Edad= " + edad;
    }
    
}
