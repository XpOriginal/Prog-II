/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_6;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author agusg
 */
public class Punto_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap <String, String> diccionario = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String palabra, significado;
        int opcion;
        
        
        do{
            System.out.println("1: Ingresar palabra y Significado | 2: Consultar significado | 3: Eliminar palabra | 4: Tamaño del diccionario | 5: Imprimir Diccionario | 6: Salir");
            opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion){
                case 1:{
                    System.out.println("Ingrese la palabra");
                    palabra = sc.nextLine();
                    System.out.println("Ingrese el significado");
                    significado = sc.nextLine();
                    
                    diccionario.put(palabra, significado);
                    break;
                }
                
                case 2:{
                    System.out.println("Ingrese la palabra a consultar");
                    palabra = sc.nextLine();
                    if(diccionario.containsKey(palabra)){
                        System.out.println(palabra + ": " + diccionario.get(palabra));
                    }else{
                        System.out.println("La palabra no esta registrada o esta mal escrita");
                    }
                    break;
                }
                
                case 3:{
                    System.out.println("Ingrese la palabra la cual quiere eliminar");
                    palabra = sc.nextLine();
                    if(diccionario.containsKey(palabra)){
                        diccionario.remove(palabra);
                    }else{
                        System.out.println("La palabra no esta registrada o esta mal escrita");
                    }
                    break;
                }
                
                case 4:{
                    System.out.println("El diccionario tiene " + diccionario.size() + " palabras registradas");
                    break;
                }
                
                case 5:{
                    int contador = 0;
                    for(Map.Entry<String, String> d : diccionario.entrySet()){
                        System.out.print("|" + (contador+1) + "| ");
                        System.out.println(d.getKey() + ": " + d.getValue());
                        contador++;
                    }
                    break;
                }
                
                case 6:{
                    System.out.println("Saliendo...");
                    break;
                }
            }
        }while(opcion != 6);
    }
    
}
