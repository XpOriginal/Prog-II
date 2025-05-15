/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_8;


import java.util.Scanner;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author agusg
 */
public class Punto_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File archivo = new File("parrafo.txt");
        String auxString;
        Scanner sc = new Scanner(System.in);
        
        try{
            if(archivo.exists()){
                //Escribir en el archivo
                
                while(true){
                    FileWriter escritor = new FileWriter(archivo, true);
                    System.out.println("Ingrese una oracion (Ingrese '*' si quiere terminar)");
                    auxString = sc.nextLine();
                    if(auxString.equals("*")){
                        break;
                    }
                    escritor.write(auxString + "\n");
                    escritor.close();
                }
                
                //-----------------------------------------------------------------------------------------------
                
                //Mostrar el archivo
                FileReader lector = new FileReader(archivo);
                BufferedReader bLector = new BufferedReader(lector);
                String s;
                while((s=bLector.readLine()) != null){
                    System.out.println(s);
                }
                
            }else{

                //CREA EL ARCHIVO SI NO EXISTE
                System.out.println("Archivo no encontrado... creando");
                System.out.println("Archivo creado...");
                BufferedWriter creador = new BufferedWriter(new FileWriter(archivo));
                creador.close();
                
                
                
                //Escribir en el archivo
                while(true){
                    FileWriter escritor = new FileWriter(archivo, true);
                    System.out.println("Ingrese una oracion (Ingrese '*' si quiere terminar)");
                    auxString = sc.nextLine();
                    if(auxString.equals("*")){
                        break;
                    }
                    escritor.write(auxString + "\n");
                    escritor.close();
                }
                
                //-----------------------------------------------------------------------------------------------
                
                //Mostrar el archivo
                FileReader lector = new FileReader(archivo);
                BufferedReader bLector = new BufferedReader(lector);
                String s;
                while((s=bLector.readLine()) != null){
                    System.out.println(s);
                }
            }
        }
        
        catch(FileNotFoundException fnfe){
            System.out.println("A ocurrido un error");
            System.out.println(fnfe);
        }
        catch(IOException ioe){
            System.out.println("Fatal error");
            System.out.println(ioe + ioe.getMessage());
        }
    }
    
}
