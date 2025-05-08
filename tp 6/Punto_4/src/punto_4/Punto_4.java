/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_4;
import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class Punto_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero de 1 al 10");
        int auxInt = sc.nextInt();
        try{
        if(auxInt < 1 || auxInt > 10){
            throw new ArrayIndexOutOfBoundsException();
        }
        
        }catch(RuntimeException rt){
            System.out.println("El nmumero ingresado es mayor/menor a lo pedido");
        }
    }
    
}
