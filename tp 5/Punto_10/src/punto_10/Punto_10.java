/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_10;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Punto_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String auxString;
        int auxInt = 0;
        Contacto contactoAux;
        HashMap<String, Contacto> agenda = new HashMap<>();
        
        do{
            contactoAux = new Contacto();
            System.out.println("Ingrese el Nombre del contacto");
            auxString = sc.nextLine();
            contactoAux.setNombre(auxString);
            
            System.out.println("Ingrese el Apellido del contacto");
            auxString = sc.nextLine();
            contactoAux.setApellido(auxString);
            
            System.out.println("Ingrese el numero del contacto");
            auxString = sc.nextLine();
            agenda.put(auxString, contactoAux);
            
            System.out.println("Quiere ingresar otro contacto?");
            System.out.println("0: NO | 1: SI");
            auxInt = sc.nextInt();
            sc.nextLine();
        }while(auxInt != 0);
        
        System.out.println("TODOS LOS CONTACTOS");
        System.out.println(agenda);

    }
}
