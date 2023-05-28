/*
9. Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */
package javaejercicio9extra;
import java.util.Scanner;

public class JavaEjercicio9Extra {

    public static void main(String[] args) {


    Scanner leer = new Scanner(System.in);

 int dividendo;
int divisor;
int cociente = 0;
int resto=0;


        System.out.println("ingrese el dividendo");
        dividendo=leer.nextInt();
        System.out.println("ingrese el divisor");
        divisor=leer.nextInt();
         
        
        do {
         resto=dividendo-divisor;
         System.out.println("resto " + resto);
         dividendo=resto;
         cociente++;
         System.out.println("cociente " + cociente);
            
         
        } while (resto>=divisor);
          
        System.out.println("-----------");
        
        System.out.println("resto= " + resto);
       System.out.println("cociente = " + cociente);


}
}


