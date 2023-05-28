//Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
//de 2 dígitos, etcétera (hasta 5 dígitos).
package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese tamaño de vector");
        int N = leer.nextInt();

        int[] vector = new int[N];

        System.out.println("nros incluidos en el vector : ");
        autorellenar(vector);

        System.out.println("buscar nros por cantidad de digito: ");
        //int num = 0;
        buscarNumerosPorDigito(vector);
    }

    public static void autorellenar(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100000);
            System.out.print(vector[i] + " ");
        }

    }

    public static void buscarNumerosPorDigito(int[] vector) {

        int contador=0;
        int contador2=0;
        int contador3=0;
        int contador4=0;
        int contador5=0;
     
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] <=9) {
               contador++;
            }  
            if (vector[i]>=10 && vector[i]<=99){
            contador2++;
        }
            if (vector[i]>=100 && vector[i]<=999){
            contador3++;
        }
            if (vector[i]>=1000 && vector[i]<=9999){
            contador4++;
        }
            if (vector[i]>=10000 && vector[i]<=99999){
            contador5++;
        }
    }
         System.out.println("nros de 1 digito : " + contador);
        System.out.println("nros de 2 digito : " + contador2);
        System.out.println("nros de 3 digitos : " + contador3);
        System.out.println("nros de 4 digitos : " + contador4);
        System.out.println("nros de 5 digitos : " + contador5);
}
}
