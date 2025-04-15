/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_4;

/**
 *
 * @author agusg
 */
public class Isoceles extends Triangulo{

    public Isoceles() {
    }

    public Isoceles(Figura f, Triangulo t) {
        super(f, t);
    }
    
    @Override
    public void mostrarFigura(){
        super.mostrarFigura();
        System.out.println("Tipo: Isóceles");
    }
}
