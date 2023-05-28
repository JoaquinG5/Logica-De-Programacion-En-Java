/*
 Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados
 */


package javaejercicio11extra;
import java.util.Scanner;

public class JavaEjercicio11Extra {

    public static void main(String[] args) {
   
      Scanner leer = new Scanner(System.in);
        int contador = 1, num;
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        if (num == 0) {
            System.out.println("Su numero es 0");

        } else {
            while (num >= 10) {
                num = num / 10;
                contador++;
            }
            System.out.println("La cantidad de numeros es de " + contador);
        }
    }
}


//otra forma de hacerlo
//public static void main(String[] args) {
//    Scanner leer=new Scanner(System.in);
//       int num,divisor;
//       int contador=0;
//    System.out.println("ingrese un numero"); 
//    num=leer.nextInt();
//    
//    if(num/10<1){
//        System.out.println("es de un digito");
//        
//    }else{
//        while(num>0){
//        System.out.println(num);
//        num=(num/10);
//        contador++;
//     }
//        System.out.println(contador);
//    }
//    
//    }
//}


