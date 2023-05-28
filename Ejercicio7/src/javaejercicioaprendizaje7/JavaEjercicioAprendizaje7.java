/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicioaprendizaje7;
import java.util.Scanner;
/**
 *
 * @author LILIANA
 */
public class JavaEjercicioAprendizaje7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("ingrese una frase");

     String frase = leer.next();

      if(frase.equalsIgnoreCase("eureka")){
        System.out.println("correcto");
    }else{

        System.out.println("incorrecto");
    }
















   }
   
}
