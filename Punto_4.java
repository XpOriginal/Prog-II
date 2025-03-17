import java.util.Scanner;

public class Punto_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        String nombre = teclado.next();
        System.out.println("Hola " + nombre + "!!");
    }
}