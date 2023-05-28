/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio10aprendizaje;
import java.util.Scanner;


/**
 *
 * @author LILIANA
 */
public class JavaEjercicio10Aprendizaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner leer=new Scanner(System.in);
        
        int num=25;
        int suma=0;
        int n=0;
        int contador=0;
        do {
           System.out.println("ingrese un numero");
           n=leer.nextInt();
           suma=suma+n;
           contador++;
       }while(suma<25);
       System.out.println("la suma de los numeros da " + suma);








    }
    
}
