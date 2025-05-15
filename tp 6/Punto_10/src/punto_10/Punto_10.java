/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_10;

import java.util.List;
import java.util.ArrayList;
import java.io.IOException;

import java.util.Scanner;

/**
 *
 * @author agusg
 */
public class Punto_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        Usuario auxUsuario = new Usuario();
        Archivo auxArchivos = new Archivo();
        List <Usuario> usuarios = new ArrayList<>();
        
        
        auxArchivos.cargarUsuarioArchivo("usuarios.txt", usuarios);
        
        for(Usuario u : usuarios){
            System.out.println(u);
        }
        
        
        
    }
    
}
