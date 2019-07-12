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
public class Paralelo {
    private String nombre;
    private Asignatura [] lista;
    
     public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerAsignatura(Asignatura [] a){
        lista = a;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
        
    public Asignatura [] obtenerAsignatura(){
        return lista;
    }
    
}
