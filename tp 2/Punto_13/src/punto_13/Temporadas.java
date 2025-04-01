/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_13;

/**
 *
 * @author Usuario
 */
public class Temporadas {
    private int cantCapitulos, anio;
    private Capitulos capitulos = new Capitulos();
    
    public Temporadas() {
    }

    public Temporadas(int cantCapitulos, int anio, Capitulos capitulos) {
        this.cantCapitulos = cantCapitulos;
        this.anio = anio;
        this.capitulos = capitulos;
    }

    public int getCantCapitulos() {
        return cantCapitulos;
    }

    public void setCantCapitulos(int cantCapitulos) {
        this.cantCapitulos = cantCapitulos;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Capitulos getCapitulos() {
        return capitulos;
    }
    
    public void setCapitulos(Capitulos capitulos) {
        this.capitulos = capitulos;
    }
   
    public void agregarCapitulos(int capitulos, int numTemporada){
        this.cantCapitulos = capitulos + this.cantCapitulos;
    }
    
    
}
