import java.util.Scanner;
 
public class Punto_5{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        float x, y;
        
        System.out.println("Ingrese x: ");
        x = teclado.nextFloat();
        System.out.println("Ingrese y:");
        y = teclado.nextFloat();
        
        System.out.println("Suma de los numeros: " + (x+y));
        System.out.println("Resta de los numeros: " +(x-y));
        
        if(y == 0)
            System.out.println("Se intento dividir entre 0, No existe");
        else
             System.out.println("Division de los numeros: " +(x/y));            
        
        System.out.println("Multiplicacion de los numeros: " +(x*y));
        
    }
}