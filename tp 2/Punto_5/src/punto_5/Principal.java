/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_5;

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
            Libro libro = new Libro();
            Scanner teclado = new Scanner(System.in);
            
            System.out.println("Ingrese el ISBN del libro");
            int isbn = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Ingrese el Titulo del libro");
            String titulo = teclado.nextLine();
            System.out.println("Ingrese el autor del libro");
            String autor = teclado.nextLine();
            System.out.println("Ingrese el numero de paginas");
            int num = teclado.nextInt();
            teclado.nextLine();
            
            libro.setIsbn(isbn);
            libro.setTitulo(titulo);
            libro.setAutor(autor);
            libro.setNumPaginas(num);
            
            System.out.println("MIO");
            System.out.println(libro.toStringg());
            
            System.out.println("PROGRAMA");
            System.out.println(libro.toString());
    }
    
}
