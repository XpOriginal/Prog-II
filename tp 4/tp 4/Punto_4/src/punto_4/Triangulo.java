/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_4;

/**
 *
 * @author agusg
 */
public class Triangulo extends Figura{
    private float lado1, lado2, lado3;          //CENTIMETROS

    public Triangulo() {
    }

    public Triangulo(Figura f) {
        super(f);
    }
    
    public Triangulo(float lado1, float lado2, float lado3, Figura f) {
        super(f);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    public Triangulo(Figura f, Triangulo t){
        super(f);
        this.lado1 = t.getLado1();
        this.lado2 = t.getLado2();
        this.lado3 = t.getLado3();
    }
    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public float getLado3() {
        return lado3;
    }

    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }
    
    @Override
    public double calcularPerimetro(){
        return lado1 + lado2 + lado3;
    }
    
    @Override
    public double calcularArea(){
        double s  = calcularPerimetro() / 2;
        return Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
    }
        
    @Override
    public void mostrarFigura(){
        System.out.println("Figura: Triangulo");
        System.out.println("Relleno: " + super.isRelleno());
        System.out.println("Color: " + super.getColor());
        System.out.println("Lado 1: " + lado1);
        System.out.println("Lado 2: " + lado2);
        System.out.println("Lado 3: " + lado3);

    }
}
