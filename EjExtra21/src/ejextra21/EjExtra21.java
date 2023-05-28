//Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
//adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
//desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
//prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
//Primer trabajo práctico evaluativo 10%
//Segundo trabajo práctico evaluativo 15%
//Primer Integrador 25%
//Segundo integrador 50%
//Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
//programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
//desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
//igual al 7 de sus notas del curso.

package ejextra21;
import java.util.Scanner;

 
public class EjExtra21 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        double [] alumnos= new double[10];
    
        notaAlumnos(alumnos,leer);
        promedioNotasAlumnos(alumnos);
        
    }
    
    
    
    public static void notaAlumnos(double [] alumnos,Scanner leer){

        for (int i = 0; i < 10; i++) {
            
        System.out.println("ingresar nota de primer trabajo pratico evaluativo");
        double nota1=leer.nextDouble()*0.10;
        System.out.println("ingresar nota de segundo trabajo pratico  evaluativo");
        double nota2=leer.nextDouble()*0.15;
        System.out.println("ingresar nota de primer integrador");
        double nota3=leer.nextDouble()*0.25;
        System.out.println("ingresar nota de segundo integrador");
        double nota4=leer.nextDouble()*0.50;
        
        alumnos[i]=nota1+nota2+nota3+nota4;
        }
    }
    
    
     public static void promedioNotasAlumnos(double [] alumnos){

     int contadorAprobados=0,contadorDesaprobados=0;
      
         System.out.println("averiguar cantidad de alumnos Aprobados y Desaprobados");
         
         for (int i = 0; i < 10; i++) {    
            if(alumnos[i]>7){
         System.out.println("aprobado");
         contadorAprobados++;
        }else{
          System.out.println("desaprobado");
             contadorDesaprobados++;
         }
             
}    
            System.out.println("Aprobados: " + contadorAprobados);
             System.out.println("Desaprobados: " + contadorDesaprobados);
}
     }

