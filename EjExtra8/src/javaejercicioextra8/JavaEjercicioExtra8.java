/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package javaejercicioextra8;
import java.util.Scanner;

public class JavaEjercicioExtra8 {

    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner leer = new Scanner(System.in);
        int num, contN = 0, contP = 0, contI = 0;
        
        do {
            System.out.println("Ingrese un número.");
            num = leer.nextInt();
            if (num % 5 == 0 && num != 0) {
                if (num % 2 == 0 && num>0) {
                    contP++;
                } else if(num>0) {
                    contI++;
                }
                break;
            }
            if (num < 0) {
                continue;
            }
            contN++;
            if (num % 2 == 0) {
                contP++;
            } else {
                contI++;
            }

        } while (num <= 0 || num > 0);
        System.out.println("Has ingresado " + contN + " números.");
        System.out.println("La cantidad de números pares es: " + contP);
        System.out.println("La cantidad de números impares es: " + contI);

        
    }
    
}
