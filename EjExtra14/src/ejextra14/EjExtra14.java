
//Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
//hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
//de hijos para averiguar la media de edad de los hijos de todas las familias.


package ejextra14;
import java.util.Scanner;

 
public class EjExtra14 {
    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

    
int n=0;
int m=0;
int sumaEdades=0;
int sumaHijos=0;
int edades=0;



   
        System.out.println("ingrese la cantidad de familias");
        n=leer.nextInt();
    
        for (int i = 1;i<=n; i++) {
            System.out.println("ingrese la cantidad de hijos de familia " + i);
            m=leer.nextInt();
            sumaHijos+=m;
          if(m!=0){
              System.out.println("ingrese las edades de los hijos");
          }
            for (int j = 1; j <=m; j++) {
                System.out.println("hijo " + j);
                edades=leer.nextInt();
                sumaEdades+=edades;
            }
           
        }
         System.out.println("edades en promedio de  sus hijos en la familia " + sumaEdades);
            System.out.println("promedio de edades en la familia " + sumaHijos); 

}
}