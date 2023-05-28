/*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

En este caso la matriz es anti simétrica
 */
package javaejercicio19aprendizaje;

import java.util.Scanner;

public class JavaEjercicio19Aprendizaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int condicion = 0;
        boolean comparar = false;

        int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        int[][] matriz2 = new int[3][3];
        
        
         System.out.println("matriz");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
                
            }
            System.out.println(" ");
        }
        
      System.out.println("----------------------------------");
        
        System.out.println("matriz transpuesta");
        
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[j][i] + "]");
            }
            System.out.println("");
        }
        System.out.println(" ");
        
     System.out.println("-----------------------------------");
        
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                //System.out.print("[" + matriz[i][j] + "]");
                matriz[j][i]=matriz[i][j];
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] + matriz[j][i] != 0) {
                    comparar = false;
                    break;
                }
            }
            if (comparar) {
                break;
            }
        }

        if (comparar==true) {
            System.out.println("No es anti simetrica");
        } else {
            System.out.println("Es anti simetrica");
        }
        System.out.println("");
    }
    
}
