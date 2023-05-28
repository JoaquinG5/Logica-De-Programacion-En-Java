
//Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
//N, con los valores ingresados por el usuario.
package ejextra18;
import java.util.Scanner;

 
public class EjExtra18 {
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("ingrese la cantidad de elementos que compondrand el vector");
       int n=leer.nextInt();
       
        int[] vector= new int[n];
        
        int suma=0;
        
        
        System.out.println("------------------------------------------");
        
        for (int i = 0; i < n; i++) {
            
            System.out.println("rellene el vector");
            vector[i]=leer.nextInt();
            
            suma+=vector[i];
            
        }
        System.out.println("suma total de elemenetos " + suma);
        
}
}