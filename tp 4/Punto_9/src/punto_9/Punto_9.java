/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_9;

/**
 *
 * @author donjo
 */
public class Punto_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Canario canario = new Canario("Canario", 5);
        Paloma paloma = new Paloma("Paloma", 2);
        
        IngInformatico informatico = new IngInformatico("Alex", 20);
        LicEnComputacion lic = new LicEnComputacion("Lucia", 23);
        
        Cantante []cantante = {canario, paloma, informatico, lic};
        
        for(Cantante c : cantante){
            System.out.println(c.getNombre() + ": " + c.canta());
        }
    }
    
}
