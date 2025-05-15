/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Arbitro extends Persona{
    private int tarjetasSacadas;
    private boolean internacional;  //true = internashonal

    public Arbitro() {
    }

    public Arbitro(int tarjetasSacadas, boolean internacional, String nombre, String apellido, Fecha fechaNacimiento, String nacionalidad) {
        super(nombre, apellido, fechaNacimiento, nacionalidad);
        this.tarjetasSacadas = tarjetasSacadas;
        this.internacional = internacional;
    }

    public Arbitro(int tarjetasSacadas, boolean internacional, Persona p) {
        super(p);
        this.tarjetasSacadas = tarjetasSacadas;
        this.internacional = internacional;
    }

    public Arbitro(Persona p) {
        super(p);
    }

    public int getTarjetasSacadas() {
        return tarjetasSacadas;
    }

    public void setTarjetasSacadas(int tarjetasSacadas) {
        this.tarjetasSacadas = tarjetasSacadas;
    }

    public boolean isInternacional() {
        return internacional;
    }

    public void setInternacional(boolean internacional) {
        this.internacional = internacional;
    }

    @Override
    public String imprimirNombre(){
        return this.getNombre() + " " + this.getApellido();
    }
    
    @Override
    public String toString() {
        return "Arbitro{" + "tarjetasSacadas=" + tarjetasSacadas + ", internacional=" + internacional + '}';
    }
    
    
    
    
    
    
}
