
package JavaEjercicio13;
import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio13 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("ingrese la longitud de su figura");
        int num=leer.nextInt();
        
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if(i==1 || i==num || j==1 || j==num){
                    System.out.print(" *");
            }else{
                System.out.print("  ");
            }
        }
            System.out.println("");
        
    }
    }
}

   



