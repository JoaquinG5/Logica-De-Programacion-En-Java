/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package javaejercicio1extra;
import java.util.Scanner;


public class JavaEjercicio1Extra {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese una cantidad de minutos");
        int minutos=leer.nextInt();
        
       
        double horas = (minutos)/(60);
        double dias = (horas) /(24);
        double horas2  =((horas) -(Math.floor(dias)*24)); 
       
         System.out.println(Math.floor(dias)+ " dias "+ horas2 + " horas.");
        

    
    }
    
}
