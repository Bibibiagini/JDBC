/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1relaciones;

import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Bibi
 */
public class Ejercicio1relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Perro p1 = new Perro("Fer", "Foxterrier", 4, "grande");
    Perro p2 = new Perro("Luca", "Beagle", 3, "pequeño");   
    List<Perro> perros;
        perros = new ArrayList();
    perros.add(p1);
    perros.add(p2);
    
    Persona per = new Persona();
    per.setApellido("Biagini");
    per.setDocumento(21704377);
    per.setEdad(51);
    per.setNombre("Bibiana");
    per.setPerros(p1);
    System.out.println(per.toString());
    
    per.setApellido("Lopez");
    per.setDocumento(21038647);
    per.setEdad(52);
    per.setNombre("Jorge");
    per.setPerros(p2);
    
    System.out.println(per.toString());
            
            
            
    }
    
}
