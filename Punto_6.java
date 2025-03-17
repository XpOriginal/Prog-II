import java.util.Scanner;

public class Punto_6{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        int a[] = new int[5];
        
        for(int i=0; i<a.length; i++){
            System.out.println("Ingrese el indice " +(i+1));
            a[i] = teclado.nextInt();
        }

        for(int i=a.length; i<0; i--){
            System.out.println("" +a[i]*2 + " ");
        }

    }
}