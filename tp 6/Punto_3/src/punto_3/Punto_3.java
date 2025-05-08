/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_3;

/**
 *
 * @author Usuario
 */
public class Punto_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            System.out.println("El resultado de 1/0 es: " + 1/0);
            
        }catch(RuntimeException rt){
            System.out.println("Se a producido un error.");
        }
        
    }
    
}
