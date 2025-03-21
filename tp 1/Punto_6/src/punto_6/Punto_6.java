/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_6;

import java.util.Scanner;

/**
 *
 * @author agusg
 */
public class Punto_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int a[] = new int[5];
        
        for(int i=0; i<a.length; i++){
            System.out.println("Ingrese el indice " +(i+1));
            a[i] = teclado.nextInt();
        }

        for(int i=a.length; i<0; i--){
            System.out.println("" +a[i]*2 + " ");
        }

    }
    
}
