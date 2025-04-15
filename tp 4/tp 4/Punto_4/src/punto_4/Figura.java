/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_4;

/**
 *
 * @author agusg
 */
public abstract class Figura {
    private String color;
    private boolean relleno;

    public Figura() {
    }    
    
    public Figura(String color, boolean relleno) {
        this.color = color;
        this.relleno = relleno;
    }
    
    public Figura(Figura f){
        this.color = f.getColor();
        this.relleno = f.isRelleno();
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }
    
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    public abstract void mostrarFigura();
}
