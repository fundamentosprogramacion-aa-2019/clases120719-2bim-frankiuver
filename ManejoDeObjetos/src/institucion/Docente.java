/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion;

/**
 *
 * @author JOSE
 */
public class Docente {
    private String nombre;
    private int anioExperiencia;
    private int edad;
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerEdad(int e){
        edad = e;
    }
    
    public void establecerAnioExperiencia(int anioexp){
        anioExperiencia = anioexp;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
        
    public int obtenerAnioExperiencia(){
        return anioExperiencia;
    }
            
    public int obtenerEdad(){
        return edad;
    }
}
