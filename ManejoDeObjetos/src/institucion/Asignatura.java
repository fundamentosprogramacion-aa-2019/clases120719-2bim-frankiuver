/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion;

/**
 *
 * @author Jose Luis
 */
public class Asignatura {
    private String nombre;
    private String horario;
    private Docente docente;
    private int creditos;
   
    
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerHorario(String h){
        horario = h;
    }
    
    public void establecerCreditos(int c){
        creditos = c;
    }
    
    public void establecerDocente(Docente d){
        docente = d;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
        
    public String obtenerHorario(){
        return horario;
    }
            
    public int obtenerCredito(){
        return creditos;
    }
    
    public Docente obtenerDocente(){
        return docente;
    }
}
