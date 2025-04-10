/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Punto_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, auxInt;
        String auxString;
        
        LicEnComputacion licAux = new LicEnComputacion();
        
        
        System.out.println("Ingrese la cantidad de Personas que quiere ingresar");
        n = sc.nextInt();
        
        Persona []p = new Persona[n]; 
        
       for(int i = 0; i<n; i++){
           IngInformatico ingAux = new IngInformatico();
           System.out.println("¿Es Ingeniero Informatico o Licenciado en Computacion?");
           System.out.println("1: Informatico | 2: Licenciado");
           auxInt = sc.nextInt();
           while(auxInt < 1 || auxInt > 2){
               System.out.println("Error, ingrese nuevamente");
               auxInt = sc.nextInt();
           }
           
           if(auxInt == 1){             //INFORMATICO
            System.out.println("Ingrese el nombre");
            auxString = sc.next();
            sc.nextLine();
            ingAux.setNombre(auxString);
            
            System.out.println("Ingrese el estado civil del estudiante");
            System.out.println("1 = SOLTERO/A | 2 = CASADO/A | 3 = VIUDO/A");
            auxInt = sc.nextInt();
            while(auxInt < 1 || auxInt > 3){
                System.out.println("Error, ingrese nuevamente");
                auxInt = sc.nextInt();
            }
            ingAux.setEstadoCivil(auxInt);
            
            System.out.println("Ingrese el DNI");
            auxInt = sc.nextInt();
            ingAux.setDni(auxInt);
            
            p[i] = ingAux;
           }
       }
    }
    
}
