/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author agusg
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Fraccion fraccion1 = new Fraccion();
        Fraccion fraccion2 = new Fraccion();
        Fraccion resultado = new Fraccion();
        
        System.out.println("Ingrese el numerador de la Fraccion 1");
        float auxNum = teclado.nextFloat();
        System.out.println("Ingrese el denominador de la Fraccion 1");
        float auxDen = teclado.nextFloat();
        fraccion1.setNum(auxNum);
        fraccion1.setDen(auxDen);
        
        System.out.println("Ingrese el numerador de la Fraccion 2");
        auxNum = teclado.nextFloat();
        System.out.println("Ingrese el denominador de la Fraccion 2");
        auxDen = teclado.nextFloat();
        fraccion2.setNum(auxNum);
        fraccion2.setDen(auxDen);

        System.out.println("-------------------------------------------");
        resultado = fraccion1.sumar(fraccion2);
        System.out.println("La suma de Fracciones: " + resultado.getNum() + "/" + resultado.getDen());
        
        System.out.println("-------------------------------------------");
        
        resultado = fraccion1.restar(fraccion2);
        System.out.println("La resta de las Fracciones son: " + resultado.getNum() + "/" + resultado.getDen());
        resultado = fraccion2.restar(fraccion1);
        System.out.println("Y tambien: " + resultado.getNum() + "/" + resultado.getDen());
        
        System.out.println("-------------------------------------------");
        
        resultado = fraccion1.dividir(fraccion2);
        System.out.println("La division de las fracciones son: " + resultado.getNum() + "/" + resultado.getDen());
        resultado = fraccion2.dividir(fraccion1);
        System.out.println("Y tambien: " + resultado.getNum() + "/" + resultado.getDen());
        
        System.out.println("-------------------------------------------");
        
        resultado = fraccion1.multiplicar(fraccion2);
        System.out.println("La multiplicacion de las fracciones: " + resultado.getNum() + "/" + resultado.getDen());
    }
    
}
