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
        int aux1;
        Password contra = new Password();
        Password contra_a = new Password();
        
        
        System.out.println("Ingrese la contraseña (2 Mayusculas, 3 numeros y 1 minuscula");
        String aux = sc.nextLine();
        contra.setContrasenia(aux);
        System.out.println("La contraseña es: " + contra.esSegura());
        
        System.out.println("-----------------------------------");
        
        System.out.println("CONTRASEÑA AUTOMATICA");
        System.out.println("Ingrese el tamaño de la contraseña (MAYOR A 8)");
        aux1 = sc.nextInt();
        contra_a.setContrasenia(contra_a.generarContraseña(aux1));
        System.out.println("La contraseña es: " + contra_a.getContrasenia());
        System.out.println("¿Es segura? " + contra_a.esSegura());
        
    }
    
}