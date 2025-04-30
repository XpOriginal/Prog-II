/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_4;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;
/**
 *
 * @author agusg
 */
public class Punto_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String aux1 = "Hola";
        String aux2 = "hola";
        String aux3 = "ho la";
        Set <String> conjuntoStrings = new HashSet<>();
        
        conjuntoStrings.add(aux1);
        conjuntoStrings.add(aux2);
        conjuntoStrings.add(aux3);
        conjuntoStrings.add(aux1);
        
        System.out.println("Contenido del conjunto: " + conjuntoStrings);
        System.out.println("Tamaño del conjunto: " + conjuntoStrings.size());
        
    }
    
}
