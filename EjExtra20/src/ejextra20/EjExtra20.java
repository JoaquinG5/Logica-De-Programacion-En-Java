//Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
//parámetro. Después haremos otra función o procedimiento que imprima el vector.

package ejextra20;
import java.util.Scanner;

public class EjExtra20 {
    public static void main(String[] args) {

       int [] vector= new int[30];
        
       rellenarVector(vector);
       mostrarVector(vector);
    }
    
    
    public static int[] rellenarVector(int [] vector){
        
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int)(Math.random()*29);
        }
        return vector;
      }
    
    
      public static void mostrarVector(int [] vector){
        
        for (int i = 0; i < vector.length; i++) {
               System.out.print("[" + vector[i] + "]");
        }
      }
    
}