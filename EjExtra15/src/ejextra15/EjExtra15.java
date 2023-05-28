
//Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
//restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
//matemática y deben devolver sus resultados para imprimirlos en el main.

package ejextra15;
import java.util.Scanner;

 
public class EjExtra15 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        double num1,num2;
        
        System.out.println("ingrese 2 numeros");
        num1=leer.nextInt();
        num2=leer.nextInt();
    
       menu(num1,num2,leer);
        
    }      
        
        public static void menu(double num1,double num2,Scanner leer){
             
            int opcion;
            
            do {
                System.out.println("bienvenido,elija una operacion matematica a realizar: ");
                System.out.println("1-Opcion 1-sumar");
                System.out.println("2-Opcion 2-restar");
                System.out.println("3-Opcion 3-multiplicar");
                System.out.println("4-Opcion 4-dividir");
                System.out.println("5-Salir");
                System.out.println("Elija una opcion:");
                opcion = leer.nextInt();
                
                switch (opcion) {
                    case 1:
                        System.out.println(sumar(num1,num2));
                        break;
                    case 2:
                        System.out.println(restar(num1,num2));
                        break;
                    case 3:
                        System.out.println(multiplicar(num1,num2));
                        break;
                    case 4:
                        System.out.println(dividir(num1,num2));
                        break;
                    case 5:
                        System.out.println("hasta luego....");
                        break;
                    default:
                        System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                        break;
                }
            } while (!(opcion == 5));
     
    }
    
    
    public static double sumar(double num1,double num2){
        
        double suma = num1 + num2;
        return suma;
    }

     public static double restar(double num1,double num2){
        
        double resta = num1 - num2;
        return resta;
    }

      public static double multiplicar(double num1,double num2){
        
        double multiplicacion = num1 * num2;
        return multiplicacion;
    }

       public static double dividir(double num1,double num2){
        
        double division = num1 / num2;
        return division;
    }


}
