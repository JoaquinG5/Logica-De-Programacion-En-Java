/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio9aprendizaje;
import java.util.Scanner;
/**
 *
 * @author LILIANA
 */
public class JavaEjercicio9Aprendizaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String palabra;
       
    System.out.println("ingrese una palabra");
    palabra=leer.next();

    if (palabra.substring(0,1).equalsIgnoreCase("a")){
        System.out.println("correcto");
    }else{
        System.out.println("incorrecto");
    }
  

    }

    }
   