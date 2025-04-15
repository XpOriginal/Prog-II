/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_3;

/**
 *
 * @author agusg
 */
public class IngInformatico extends Persona{
    private String titulo;
    
    public IngInformatico() {
    }
    
    public IngInformatico(Persona p) {
        super(p);
    }

    @Override
    public String titulo(){
        return "Ing.";
    }
}