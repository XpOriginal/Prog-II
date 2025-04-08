/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_8;
import java.util.Scanner;
/**
 *
 * @author agusg
 */
public class Punto_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fecha auxFecha = new Fecha();
        String auxString;
        int n, auxInt;
        
        System.out.println("Ingrese la cantidad de estudiantes que quiere ingresar");
        n = sc.nextInt();
        while(n <= 0){
            System.out.println("Error, ingrese nuevamente");
            n = sc.nextInt();
        }
        
        Persona [] p = new Persona[n];
        Estudiante [] e = new Estudiante[n];
        EstudianteADistancia [] eAD = new EstudianteADistancia[n];
        
        
        for(int i = 0; i < n; i++){
            System.out.println("--------------------------- ESTUDIANTE " + (i+1) + " ---------------------------");
            p[i] = new Persona();
            System.out.println("Ingrese el nombre");
            auxString = sc.next();
            sc.nextLine();
            p[i].setNombre(auxString);
            
            System.out.println("Ingrese la fecha de nacimiento");
            System.out.print("Dia: ");  auxInt = sc.nextInt();
            auxFecha.setDia(auxInt);
            System.out.print("Mes: ");  auxInt = sc.nextInt();
            auxFecha.setMes(auxInt);
            System.out.print("Año: ");  auxInt = sc.nextInt();
            auxFecha.setAnio(auxInt);
            p[i].setFecha(auxFecha);
            
            System.out.println("Ingrese el estado civil del estudiante");
            System.out.println("1 = SOLTERO/A | 2 = CASADO/A | 3 = VIUDO/A");
            auxInt = sc.nextInt();
            while(auxInt < 1 || auxInt > 3){
                System.out.println("Error, ingrese nuevamente");
                auxInt = sc.nextInt();
            }
            p[i].setEstadoCivil(auxInt);
            
            System.out.println("Ingrese el DNI");
            auxInt = sc.nextInt();
            p[i].setNumDocumento(auxInt);
            
            
            
            e[i] = new Estudiante(p[i]);
            System.out.println("Ingrese la carrera actual");
            auxString = sc.next();
            sc.nextLine();
            e[i].setCarrera(auxString);
            
            System.out.println("Ingrese el año delcursado");
            System.out.print("Año: ");  auxInt = sc.nextInt();
            e[i].setAnioCursada(auxInt);
            
            
            
            eAD[i] = new EstudianteADistancia(p[i], e[i]);
            System.out.println("Ingrese el usuario");
            auxString = sc.next();
            sc.nextLine();
            eAD[i].setUsuario(auxString);
            
            System.out.println("Ingrese la contraseña");
            auxString = sc.next();
            sc.nextLine();
            eAD[i].setContraseña(auxString);
            
            System.out.println("Ingrese la ciudad del estudiante");
            auxString = sc.next();
            sc.nextLine();
            eAD[i].setCiudad(auxString);
            eAD[i].toString();
        }
        
        
       System.out.println("--------------------------- TODOS LOS ESTUDIANTES ---------------------------");
       for(int i = 0; i < n; i++){
           eAD[i].toString();
       }
    }
    
}
