/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_7;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author agusg
 */
public class Punto_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String auxString;
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> contador = new LinkedHashMap<>();
        
        System.out.println("Ingrese el texto");
        auxString = sc.nextLine();
        auxString = auxString.toLowerCase();
        
        
        for(char c : auxString.toCharArray()){
            if(c != ' '){
                contador.put(c, contador.getOrDefault(c, 0) + 1);
            }
        }
        
        for(Map.Entry<Character, Integer> c : contador.entrySet()){
            System.out.print("(" + c.getKey() + "," + c.getValue() + ") ");
        }
    }
    
}
