/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicioaprendizaje4;
import java.util.Scanner;

/**
 *
 * @author LILIANA
 */
public class JavaEjercicioAprendizaje4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        int numero;
        int nroFarenheit;
        System.out.println("ingrese una cantidad de grados");
        numero=leer.nextInt();
        
        nroFarenheit=(32+(9*numero/5));
        System.out.println("el numero en grados farenheit es  " + nroFarenheit);
        
        
    }
    
}
