/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_13;

/**
 *
 * @author Usuario
 */
public class Serie {
    private String titulo, genero;
    private int cantTemporadas = 0;
    private Temporadas temporadas = new Temporadas();

    public Serie(String titulo, String genero, int cantTemporadas, Temporadas temporadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.cantTemporadas = cantTemporadas;
        this.temporadas = temporadas;
    }

    public Serie() {
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCantTemporadas() {
        return cantTemporadas;
    }

    public void setCantTemporadas(int cantTemporadas) {
        this.cantTemporadas = cantTemporadas;
    }

    public Temporadas getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Temporadas temporadas) {
        this.temporadas = temporadas;
    }
    
    
    
    public void agregarTemporada(int temporadas, int capitulos, int numTemporada){
        this.cantTemporadas = temporadas + this.cantTemporadas;
        
    }
    
    public void eliminarTemporada(Serie serie, int x){
        x = this.cantTemporadas - x;
        this.cantTemporadas = x;
    }
    
}
