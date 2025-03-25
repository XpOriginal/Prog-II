/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_9;
import java.util.Scanner;
/**
 *
 * @author agusg
 */
public class Punto_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int aux;
       
       System.out.println("Ingrese la cantidad de materias que quiere cargar");
       aux = teclado.nextInt();
       
       Materia materias[] = new Materia[aux];
       
       for(int i = 0; i < aux; i++){
           System.out.println("Ingrese el nombre de la materia");
           String nombre = teclado.next();
           teclado.nextLine();
           
           System.out.println("Ingrese el año a cual cursar la materia");
           int año = teclado.nextInt();
           while(año < 0 || año > 6){
               System.out.println("Ingrese nuevamente el año (1° a 6° año)");
               año = teclado.nextInt();
           }
           
           System.out.println("Ingrese la cantitad de estudiantes a cursar la materia");
           int estudiantes = teclado.nextInt();
           while(estudiantes < 0){
               System.out.println("Ingrese nuevamente la cantidad");
               estudiantes = teclado.nextInt();
           }
           
           System.out.println("Ingrese el cuatrimestre");
           int cuatrimestre = teclado.nextInt();
           while(cuatrimestre == 1 || cuatrimestre == 2){
               System.out.println("Ingrese nuevamente el cuatrimestre");
               cuatrimestre = teclado.nextInt();
           }
           
           materias[i].setNombre(nombre);
           materias[i].setAño(año);
           materias[i].setCantEstudiantes(estudiantes);
           materias[i].setCuatrimestre(cuatrimestre);
       }
       
       for(int i = 0; i < Materia.getCantMaterias(); i++){
           System.out.println("Materia " + (i+1) + ":" + materias[i].toString());
       }
    }
    
}
