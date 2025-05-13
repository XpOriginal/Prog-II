/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_7;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * 
 * @author Usuario
 */
public class Punto_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        try{
            File archivo = new File("nombres.txt");
            Scanner sc = new Scanner(System.in);
            String auxString;
            if(new File("nombres.txt").exists()){
                FileWriter escritor = new FileWriter(archivo, true);
                
                System.out.println("Ingrese un nombre con apellido");
                auxString = sc.nextLine();
                auxString = auxString + "\n";
                escritor.write(auxString);
                escritor.close();
            }else{
                throw new FileNotFoundException("No existe el archivo " + "| " + archivo.getName() + " |");
            }
        }catch(FileNotFoundException fnfe){
            System.out.println("Ocurrio un error");
            System.out.println(fnfe);
        }
        catch(RuntimeException rte){
            System.out.println("Fatal Error");
            System.out.println(rte);
        }
    }
    
}
