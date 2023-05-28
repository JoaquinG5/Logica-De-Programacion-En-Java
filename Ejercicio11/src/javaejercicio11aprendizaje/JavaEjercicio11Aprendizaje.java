
package javaejercicio11aprendizaje;
import java.util.Scanner;
/**
 *
 * @author LILIANA
 */
public class JavaEjercicio11Aprendizaje {
    public static void main(String[] args) {

     Scanner leer = new Scanner(System.in).useDelimiter("\n");
 
       System.out.println("ingrese un numero ");
       int numero1=leer.nextInt();
       System.out.println("ingrese otro numero");
       int numero2=leer.nextInt();
       
       int opc = 0;
       String letra = "";
        
 
    do {
        
      System.out.println("seleccione una opcion del menu: 1-suma,2-resta,3-multiplicar,4-dividir,5-salir");
        opc =leer.nextInt();
          switch (opc) {
            case 1:    
                int suma=(numero1+numero2);
                System.out.println("suma  " + suma);
                break;
            case 2:
                int resta=(numero1-numero2);
                System.out.println("resta  " + resta);
                break;
            case 3:
                 int multiplicar=(numero1*numero2);
                System.out.println("multiplicar  " + multiplicar);
                break;
            case 4:
                int dividir=(numero1/numero2);
                System.out.println("dividir  " + dividir);
                break;
            default:
                if(opc==5){
                System.out.println("esta seguro que desea salir del programa?(s/n)");
                 letra=leer.next();
                }
                if (letra.equalsIgnoreCase("s")){
                    System.out.println("adios");
            }
               }         
      } while (opc<5 || letra.equalsIgnoreCase("n"));
   }
}
          
         
 
        




   

