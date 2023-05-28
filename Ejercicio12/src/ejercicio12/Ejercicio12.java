
package ejercicio12;
//Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
//dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
//fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
//X y el último tiene que ser una O.
//Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
//especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
//de FDE, que no respete el formato se considera incorrecta.
//Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
//incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
//siguientes funciones de Java Substring(), Length(), equals().

import java.util.Scanner;

 
 
public class Ejercicio12 {
    public static void main(String[] args) {
   
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Dispositivo RS232");
        String cadena="";
        boolean b;
        int contador1=0;
        int contador2=0;
        
        do {
            System.out.println("ingrese una palabra");
            cadena=leer.next();
            int a=cadena.length();
            if(cadena.equalsIgnoreCase("&&&&&") ){
                System.out.println("final de envios");
                b=true;
                break;
            }
             if(a!=5){
                System.out.println("cantidad de caracteres incorrecta");
                contador1++;
             }else if(cadena.charAt(0)!=('x')){
                System.out.println("su primera letra no es X");
                contador1++;
             }else if((cadena.charAt(4))!=('o')){
              System.out.println("su ultima letra no es O");
              contador1++;
             }else{
              contador2++;
             }
        } while (b=true);
        System.out.println("cadenas  correctas ingresadas " + contador2);
        System.out.println(" cadenas incorrectas ingresadas " + contador1);
    }
}