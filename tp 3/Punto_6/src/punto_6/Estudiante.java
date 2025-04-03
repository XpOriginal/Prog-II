/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_6;

/**
 *
 * @author Usuario
 */
public class Estudiante extends Persona {
    private String carrera;
    private Fecha anioCursada = new Fecha();

    public Estudiante() {
    }

    public Estudiante(Persona p) {
        super(p);
    }

    public Estudiante(String carrera, Persona p) {
        super(p);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Fecha getAnioCursada() {
        return anioCursada;
    }

    public void setAnioCursada(Fecha anioCursada) {
        this.anioCursada = anioCursada;
    }
    
    @Override
    public String toString() {
        return super.toString() + "Estudiante{" + "carrera=" + carrera + ", anioCursada=" + anioCursada + '}';
    }
}
