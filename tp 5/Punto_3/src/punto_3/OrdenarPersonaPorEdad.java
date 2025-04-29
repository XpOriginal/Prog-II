/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_3;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public class OrdenarPersonaPorEdad implements Comparator <Persona>{

    public OrdenarPersonaPorEdad() {
    }
    
    @Override
    public int compare(Persona p1, Persona p2){
        return p1.getEdad() - p2.getEdad();
    }
}
