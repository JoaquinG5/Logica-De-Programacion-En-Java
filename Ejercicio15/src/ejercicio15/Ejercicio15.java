//Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
//muestre por pantalla en orden descendente.

package ejercicio15;
import java.util.Scanner;

 //@author LILIANA
 
public class Ejercicio15 {
    public static void main(String[] args) {
        
      int[]vector= new int [100];
        vector[0]=1;
        
        for (int i = 0; i < 100; i++) {
            vector[i]=i+1;
            System.out.println("[" + vector[i] + "]");
        }
       
    }

}
