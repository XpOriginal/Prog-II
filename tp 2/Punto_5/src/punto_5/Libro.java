/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_5;

/**
 *
 * @author agusg
 */
public class Libro {
    private int isbn;
    private String autor, titulo;
    private int numPaginas;

    public Libro() {
    }

    public Libro(int isbn, String autor, String titulo, int numPaginas) {
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.numPaginas = numPaginas;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    public String toStringg(){
        return ("Libro: ISBN= " + this.isbn + ", Autor= " + this.autor + ", Titulo= " + this.titulo + ", Numero de Paginas= " + this.numPaginas);
    }
    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", autor=" + autor + ", titulo=" + titulo + ", numPaginas=" + numPaginas + '}';
    }
    
    
}
