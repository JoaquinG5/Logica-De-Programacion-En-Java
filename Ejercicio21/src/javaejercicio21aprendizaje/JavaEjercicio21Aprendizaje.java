/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package javaejercicio21aprendizaje;
import java.util.Scanner;

public class JavaEjercicio21Aprendizaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int[][] matrizgran = new int[10][10];
        int[][] matrizchi = new int[3][3];
        Scanner leer = new Scanner(System.in);
        int o, p;
        boolean verificar=false;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizgran[i][j] = (int) ((Math.random()) * 10);

            }

        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrizgran[i][j] + " ");

            }
            System.out.println("");
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("ingrese los valores de la matriz chica");
                matrizchi[i][j] = leer.nextInt();
            }

        }

        for (int k = 0; k < 10; k++) {
            for (int l = 0; l < 10; l++) {
                
                if (k<8 & l<8){
                if (matrizgran[k][l] == matrizchi[0][0] & matrizgran[k][l+1] == matrizchi[0][1] & matrizgran[k][l+2] == matrizchi[0][2]) {
                    
                   if (matrizgran[k+1][l] == matrizchi[1][0] & matrizgran[k+1][l+1] == matrizchi[1][1] & matrizgran[k+1][l+2] == matrizchi[1][2]) {
                       if (matrizgran[k+2][l] == matrizchi[2][0] & matrizgran[k+2][l+1] == matrizchi[2][1] & matrizgran[k+2][l+2] == matrizchi[2][2]) {
                            verificar= true;
                           for (int i = k; i < k+3; i++) {
                               for (int j = l; j < l+3; j++) {
                                   System.out.print("["+ i+"],["+j+"]");
                               }
                              System.out.println("");
                              
                           }
                           
                       }
                   }

                }
                
                }
              if (verificar==true){
                  break;
              }
            }
             if (verificar==true){
                  break;
        }

    }
if (verificar==false){
    System.out.println("La matriz chica no se encuentra en la grande");
}else{
    System.out.println("La matriz se encontro");
}
}
    }
    

