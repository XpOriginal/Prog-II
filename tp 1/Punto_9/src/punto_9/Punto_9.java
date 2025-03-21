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
        String letras[] = new String[10];
        int aux1, cont = 0;
        Scanner aux = new Scanner(System.in);
        for(int i=0; i<10;i++){
            System.out.println("Ingrese una letra: ");
            letras[i] = aux.nextLine();
            
        }
        System.out.println("Ingrese cuantas veces se puede repetir una letra: ");
        aux1 = aux.nextInt();
        for(int p=0;p<10;p++){
            for(int a=p; a<10;a++){
                if(letras[a] == letras[p]){
                    cont += 1;
                    
                }
            }
        }
        if(cont == aux1){
            System.out.println("Se han repetido las mismas letras " + aux1 + " o mas veces");
        }
        else{
            System.out.println("No se han repetido letras");
        }
        
    }
}