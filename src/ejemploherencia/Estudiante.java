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
public class Estudiante extends Persona {
    
    private String codigo;
    private int notaFinal;
    
    public Estudiante(String nombre, String apellido, int edad, String codigo, int notaFinal) {
        super(nombre, apellido, edad); //Primera sentencia
        this.notaFinal = notaFinal;
        this.codigo = codigo;
    }
    
    
    public String getCodigo(){
        
        return codigo;
    }
    
    public int getNotaFinal(){
       
        return notaFinal;
    }
    
    public void mostrar(){
        System.out.println("Nombre: "+ getNombre());
        System.out.println("Apellido: "+ apellido);
        System.out.println("Edad: "+ getEdad());
        System.out.println("Codigo: "+ codigo);
        System.out.println("Nota Final: "+ notaFinal);
    }

    @Override
    public String toString() {
        return "Codigo= " + codigo + ", notaFinal= " + notaFinal +super.toString();
    }
    
}
