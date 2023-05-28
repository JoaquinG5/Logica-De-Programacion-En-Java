/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicioaprendizaje8;
import java.util.Scanner;
/**
 *
 * @author LILIANA
 */
public class JavaEjercicioAprendizaje8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        
        String palabra;
        System.out.println("ingrese una palabra");
        palabra=leer.nextLine();
        
        if (palabra.length()<=8){
            System.out.println("correcto");
        }else{
             System.out.println("incorrecto");
        }
        
    }

}
