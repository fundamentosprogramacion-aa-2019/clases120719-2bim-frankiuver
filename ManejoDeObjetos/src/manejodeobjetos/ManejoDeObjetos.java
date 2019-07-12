/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package manejodeobjetos;
import institucion.Asignatura;

import institucion.Docente;
/**
 *
 * @author JOSE
 */
public class ManejoDeObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Docente d = new Docente();
        d.establecerNombre("Rodrigo Estrada");
        d.establecerAnioExperiencia(10);
        d.establecerEdad(30);
        
        Docente d2 = new Docente();
        d2.establecerNombre("Jhon Calle");
        d2.establecerAnioExperiencia(5);
        d2.establecerEdad(31);
        
        Asignatura a1 = new Asignatura();
        a1.establecerNombre("Programacion");
        a1.establecerHorario("Viernes: 08-11");
        a1.establecerCreditos(4);
        a1.establecerDocente(d);
        
        Asignatura a2 = new Asignatura();
        a2.establecerNombre("Base De datos");
        a2.establecerHorario("Jueves: 10-13");
        a2.establecerCreditos(3);
        a2.establecerDocente(d2);
        
        Asignatura [] lista = new Asignatura[2];
        lista[0] = a1;
        lista[1] = a2;
        
        /*for (int i = 0; i < lista.length; i++) {
            System.out.printf("Asignatura: %s\nDocente: \n\tNombre: %s\n\t"
                    + "Edad: %d\n", 
                    lista[i].obtenerNombre(), 
                    lista[i].obtenerDocente().obtenerNombre(), 
                    lista[i].obtenerDocente().obtenerEdad());
        }*/
        for (int i = 0; i < lista.length; i++) {
            Asignatura a = lista[i];
            System.out.printf("Asignatura: %s\nDocente: \n\tNombre: %s\n\t"
                    + "Edad: %d\n", 
                    a.obtenerNombre(), 
                    a.obtenerDocente().obtenerNombre(), 
                    a.obtenerDocente().obtenerEdad());
        }
    }
    
}
