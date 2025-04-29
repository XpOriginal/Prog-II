/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_3;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
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
        List <Persona> c = new ArrayList<>();
        int auxInt, control = 0, contador = 0;
        String auxString;
        
        
        do{
            Persona personaAux = new Persona();
            System.out.println("Ingrese el nombre");
            auxString = sc.nextLine();
            personaAux.setNombre(auxString);
            
            System.out.println("Ingrese la edad");
            auxInt = sc.nextInt();
            personaAux.setEdad(auxInt);
            
            System.out.println("¿Quiere ingresar otra persona?");
            System.out.println("1: SI | 0: NO");
            auxInt = sc.nextInt();
            
            while(auxInt > 1 || auxInt < 0){
                System.out.println("ERROR: Ingrese nuevamente");
                 auxInt = sc.nextInt();
            }
            
            if(auxInt == 1){
                control = 1;
            }else{
                control = 0;
            }
            
            c.add(personaAux);
            sc.nextLine();
        }while(control != 0);
        
        
        System.out.println("---------------Lista desordenada---------------");
        for(Persona personas : c){
            System.out.print((contador+1) + ": ");
            System.out.println(personas);
            contador++;
        }
        
        Collections.sort(c, new OrdenarPersonaPorEdad());
        System.out.println("---------------Lista Ordenada (Por edad menor a mayor)---------------");
        contador = 0;
        
        for(Persona personas : c){
            System.out.print((contador+1) + ": ");
            System.out.println(personas);
            contador++;
        }
        
        Collections.reverse(c);
        System.out.println("---------------Lista Al Reves---------------");
        contador = 0;
        
        for(Persona personas : c){
            System.out.print((contador+1) + ": ");
            System.out.println(personas);
            contador++;
        }
    }
    
}