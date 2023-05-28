/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio1aprendizaje;

import java.util.Scanner;

/**
 *
 * @author LILIANA
 */
public class JavaEjercicio1Aprendizaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // Scanner leer= new Scanner(System.in);

     Scanner leer = new Scanner(System.in).useDelimiter("\n");

    System.out.println("ingrese dos numeros enteros");
        
    int num1 = leer.nextInt();
    int num2 = leer.nextInt();
    
    int suma= num1+num2;
    
     System.out.println("la suma de loa dos numeros es " + suma);








    }
    
}
