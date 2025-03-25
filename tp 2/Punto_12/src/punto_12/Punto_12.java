/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_12;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Punto_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Password contras = new Password();
        
        
        System.out.println("Ingrese la contraseña");
        String aux = sc.nextLine();
        contras.setContrasenia(aux);
        
        System.out.println("La contraseña es: " + contras.esSegura());
        
    }
    
}
