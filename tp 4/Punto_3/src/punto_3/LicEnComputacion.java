/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_3;

/**
 *
 * @author Usuario
 */
public class LicEnComputacion extends Persona{
    private String titulo;
    private int anioDeEgreso;
    
    public LicEnComputacion() {
    }

    public LicEnComputacion(Persona p) {
        super(p);
    }

    public LicEnComputacion(int anioDeEgreso, Persona p) {
        super(p);
        this.anioDeEgreso = anioDeEgreso;
    }

    public int getAnioDeEgreso() {
        return anioDeEgreso;
    }

    public void setAnioDeEgreso(int anioDeEgreso) {
        this.anioDeEgreso = anioDeEgreso;
    }
    
    
    
    @Override
    public String titulo(){
        return "Usted es Licenciado en Computacion";
    }
}

