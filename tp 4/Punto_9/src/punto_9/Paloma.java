/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_9;

/**
 *
 * @author donjo
 */
public class Paloma extends Ave{

    public Paloma(String nombre, int edad) {
        super(nombre, edad);
    }
    
    
    @Override
    public String canta(){
        return "El Paloma canta";
    }
}
