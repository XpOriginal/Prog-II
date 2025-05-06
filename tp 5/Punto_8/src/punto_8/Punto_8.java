/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_8;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class Punto_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List <Integer> b = new ArrayList(); 
        b.add(2);
        b.add(1);
        b.add(9);
        b.add(6);
        b.add(5);
        b.add(6);
        
        Bolsa bolsa = new Bolsa(b);
        
        System.out.println(bolsa);
        
        
    }
    
}
