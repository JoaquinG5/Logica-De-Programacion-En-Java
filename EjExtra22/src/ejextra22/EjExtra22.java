
//Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
//muestre la suma de sus elementos.

package ejextra22;
import java.util.Scanner;

 
 
public class EjExtra22 {
    public static void main(String[] args) {
 
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
         System.out.println("ingrese nro de filas");
        int filas=leer.nextInt();
        System.out.println("ingrese nro de columnas");
        int columnas=leer.nextInt();
        
        int[][]matriz= new int [filas][columnas] ;
        
        rellenarMatriz(matriz,filas,columnas);
        suma(matriz,filas,columnas);
        
    }      
        
     public static void rellenarMatriz(int [][] matriz,int filas,int columnas){   
         
         for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j]= (int)(Math.random()*11);
            }
        }
        
         for (int i = 0; i < filas; i++) {
             for (int j = 0; j < columnas; j++) {
                  System.out.print("[" + matriz[i][j] + "]");
             }
             
             System.out.println(" ");
             
        }
     }

     
     
     public static int suma(int [][] matriz,int filas,int columnas){
         
         int suma=0;
         
          for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma+=matriz[i][j];
            }
        }
         System.out.println("suma de nros aleatorios " + suma);
         
         return suma;
   }
} 

        
  

