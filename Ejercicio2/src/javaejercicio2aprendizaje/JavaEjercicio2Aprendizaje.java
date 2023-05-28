/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio2aprendizaje;
import java.util.Scanner;

/**
 *
 * @author LILIANA
 */
public class JavaEjercicio2Aprendizaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Scanner leer= new Scanner(System.in);
//        
//        String nombre;
//        
//        System.out.println("ingrese tu nombre");
//        
//        nombre=leer.nextLine();
//        
//        System.out.print("mi nombre es " + nombre);
        

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
    

        String nombre;
    
    
    
        System.out.println(" cual es tu nombre?");

         nombre=leer.next();

        System.out.println("mi nombre es " + nombre);

    }
    
}
