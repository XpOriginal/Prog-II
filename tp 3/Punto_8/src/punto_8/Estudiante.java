/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_8;

/**
 *
 * @author agusg
 */
public class Estudiante extends Persona {
    private String carrera;
    private int anioCursada;

    public Estudiante() {
    }

    public Estudiante(Persona p) {
        super(p);
    }
    
    public Estudiante(String carrera, int anioCursada, Persona p) {
        super(p);
        this.carrera = carrera;
        this.anioCursada = anioCursada;
    }
    
    public Estudiante(Persona p, Estudiante e){
        super(p);
        this.carrera = e.getCarrera();
        this.anioCursada = e.getAnioCursada();
        
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getAnioCursada() {
        return anioCursada;
    }

    public void setAnioCursada(int anioCursada) {
        this.anioCursada = anioCursada;
    }
    
    @Override
    public String toString() {
        return super.toString() + "Estudiante{" + "carrera=" + carrera + ", anioCursada=" + anioCursada + '}';
    }
}