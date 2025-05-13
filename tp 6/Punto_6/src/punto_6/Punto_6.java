/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_6;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author agusg
 */
public class Punto_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try{
            File archivo = new File("nombres.txt");
            if(archivo.exists()){
                FileReader lector = new FileReader(archivo);
                BufferedReader bLector = new BufferedReader(lector);
                String s, texto = "";
                while((s=bLector.readLine()) != null){
                    texto += s + "\n";
                }
                System.out.println(texto);
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