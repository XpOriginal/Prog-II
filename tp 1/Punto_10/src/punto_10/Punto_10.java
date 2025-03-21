/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_10;

/**
 *
 * @author agusg
 */
public class Punto_10 {
    static final int TAM = 9;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int aux1 = 0, aux2 = 0, i, a;
       
       for(i = 0; i < TAM; i++){
           if(aux1 == aux2)
               aux1++;
           else
               aux2++;
       }
       
       if(aux1 == aux2){
           for(a=0; a < TAM; a++){
               System.out.println((2*a));
           }
      }else{
           for(a=1; a < TAM+1; a++){
               System.out.println(((2*a)-1));
           }
       }
    }
    
}