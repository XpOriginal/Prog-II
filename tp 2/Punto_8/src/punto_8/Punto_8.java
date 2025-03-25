/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_8;

/**
 *
 * @author agusg
 */
public class Punto_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Materia matematicas = new Materia("Matematicas", 2, 30, 2);
        Materia quimica = new Materia("Quimica", 3, 25, 1);
        Materia fisica = new Materia("Fisica", 3, 25, 1);
        
        System.out.println(matematicas.toString());
        System.out.println(quimica.toString());
        System.out.println(fisica.toString());
        
        System.out.println("La cantidad total de materias son: " + Materia.getCantMaterias());
        
    }
    
}
