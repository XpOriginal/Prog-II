/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_5;

import java.util.Scanner;

/**
 *
 * @author agusg
 */
public class Punto_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        float x, y;
        
        System.out.println("Ingrese x: ");
        x = teclado.nextFloat();
        System.out.println("Ingrese y:");
        y = teclado.nextFloat();
        
        System.out.println("Suma de los numeros: " + (x+y));
        System.out.println("Resta de los numeros: " +(x-y));
        
        if(y == 0)
            System.out.println("Se intento dividir entre 0, No existe");
        else
             System.out.println("Division de los numeros: " +(x/y));            
        
        System.out.println("Multiplicacion de los numeros: " +(x*y));
        
    }
    
}
