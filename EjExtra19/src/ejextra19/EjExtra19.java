//Escriba un programa que averigüe si dos vectores de N enteros son iguales (la comparación deberá
//detenerse en cuanto se detecte alguna diferencia entre los elementos).

package ejextra19;
import java.util.Scanner;

 
public class EjExtra19 {
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
       System.out.println("ingrese la cantidad de elementos que compondrand el vector");
       int n=leer.nextInt();
       
        int[] vectorA= new int[n];
        int[] vectorB=new int[n];
        

        System.out.println("------------------------------------------");
        
        for (int i = 0; i < n; i++) {
            
            System.out.println("rellene la posicion["+i+"]del vector 1");
            vectorA[i]=leer.nextInt();
            System.out.println("rellene la posicion["+i+"]del vector 2");
            vectorB[i]=leer.nextInt();
            
        }
        for (int i = 0; i < n; i++) {
            
            if(vectorA[i]!=vectorB[i]){
            System.out.println("no son iguales en la posicion ["+i+"] del vector" );
            break;
        }
        
}
        
        
}
        
        
    }


