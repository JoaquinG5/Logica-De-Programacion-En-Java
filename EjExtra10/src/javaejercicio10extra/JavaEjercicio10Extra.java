/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.

 */
package javaejercicio10extra;
import java.util.Scanner;

public class JavaEjercicio10Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
// TODO code application logic here


        int num1 = (int) (Math.random()*11);
        int num2 = (int) (Math.random()*11);
        int resultado;
        System.out.println("primer numero " + num1);
        System.out.println("segundo numero " + num2);
        resultado = num1 * num2;
        System.out.println("el resultado de la multiplicacion entre los nros  es " + resultado);
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un resultado: ");
        int entrada = leer.nextInt();
        while (entrada != resultado){
            System.out.println("Resultado incorrecto. Ingrese nuevamente un resultado: ");
            entrada = leer.nextInt();
        }
        System.out.println("El resultado ingresado es correcto.");

    }
    
}
