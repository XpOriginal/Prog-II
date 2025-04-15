/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_4;

/**
 *
 * @author agusg
 */
public class Circulo extends Figura{
    private float radio;        //CENTIMETROS

    public Circulo() {
    }
    
    public Circulo(Figura f) {
        super(f);
    }

    public Circulo(float radio, Figura f) {
        super(f);
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea(){
        return Math.PI * radio * radio;
    }
    
    @Override
    public double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }
    
    @Override
    public void mostrarFigura(){
        System.out.println("Figura: Circulo");
        System.out.println("Relleno: " + super.isRelleno());
        System.out.println("Color: " + super.getColor());
        System.out.println("Radio: " + radio);
    }
}
