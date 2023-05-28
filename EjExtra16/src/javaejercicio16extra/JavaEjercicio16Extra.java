/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package javaejercicio16extra;
import java.util.Scanner;

public class JavaEjercicio16Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //se aplican dos scanner que leen dos diferentes tipos de datos
        Scanner entrada = new Scanner(System.in);
        Scanner numero = new Scanner(System.in);
        String nombre="",salida="";
        
        int edad;
        boolean salir=true;

        while (salir==true) {

            System.out.println("Ingrese el nombre");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la edad");
            edad = numero.nextInt();
            if (edad > 18) {
                System.out.println(nombre);
                System.out.println(edad);
                System.out.println("Es mayor de edad");

            } else {
                System.out.println(nombre);
                System.out.println(edad);
                System.out.println("Es menor de edad");

            }
            
            System.out.println("desea continuar?");
            salida=entrada.nextLine();
            if (salida.equalsIgnoreCase("NO")) {
                salir=false;
                
            }

        }
    }
}