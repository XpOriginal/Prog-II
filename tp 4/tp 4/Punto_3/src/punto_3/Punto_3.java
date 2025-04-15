/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_3;

import java.util.Scanner;

/**
 *
 * @author agusg
 */
public class Punto_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, auxInt;
        String auxString;
        
        System.out.println("Ingrese la cantidad de Personas que quiere ingresar");
        n = sc.nextInt();
        
        
        Persona []p = new Persona[n]; 
        
       for(int i = 0; i<n; i++){
           
           System.out.println("¿Es Ingeniero Informatico o Licenciado en Computacion?");
           System.out.println("1: Informatico | 2: Licenciado | 3: Otro");
           auxInt = sc.nextInt();
           while(auxInt < 1 || auxInt > 3){
               System.out.println("Error, ingrese nuevamente");
               auxInt = sc.nextInt();
           }
           
           switch(auxInt){
               case 1:{     //INFORMATICO
                   IngInformatico ingAux = new IngInformatico();
                   
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
                   
                   break;
               }
            
               case 2:{     //LICENCIADO EN COMPUTACION
                   LicEnComputacion licAux = new LicEnComputacion();
                   
                   System.out.println("Ingrese el nombre");
                   auxString = sc.next();
                   sc.nextLine();
                   licAux.setNombre(auxString);
                   
                   System.out.println("Ingrese el estado civil del estudiante");
                   System.out.println("1 = SOLTERO/A | 2 = CASADO/A | 3 = VIUDO/A");
                   auxInt = sc.nextInt();
                   while(auxInt < 1 || auxInt > 3){
                       System.out.println("Error, ingrese nuevamente");
                       auxInt = sc.nextInt();
                   }
                   licAux.setEstadoCivil(auxInt);
                   
                   
                   System.out.println("Ingrese el DNI");
                   auxInt = sc.nextInt();
                   licAux.setDni(auxInt);
                   p[i] = licAux;
                   
                   break;
               }
               
               case 3:{     //SIN TITULO
                   Otro otroAux = new Otro();
                   
                   System.out.println("Ingrese el nombre");
                   auxString = sc.next();
                   sc.nextLine();
                   otroAux.setNombre(auxString);
                   
                   System.out.println("Ingrese el estado civil del estudiante");
                   System.out.println("1 = SOLTERO/A | 2 = CASADO/A | 3 = VIUDO/A");
                   auxInt = sc.nextInt();
                   while(auxInt < 1 || auxInt > 3){
                       System.out.println("Error, ingrese nuevamente");
                       auxInt = sc.nextInt();
                   }
                   otroAux.setEstadoCivil(auxInt);
                   
                   
                   System.out.println("Ingrese el DNI");
                   auxInt = sc.nextInt();
                   otroAux.setDni(auxInt);
                   p[i] = otroAux;
                   
                   break;
               }
           }
       }
       
       
        System.out.println("------------------------------------------------------------");
        System.out.println("Nombre de las personas");
       
        for(Persona personas : p){
            System.out.println(personas.getNombreTitulo());
        }
    }
    
}