/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_8;

/**
 *
 * @author agusg
 */
public class Persona {
    private String nombre;
    private int numDocumento;
    private int estadoCivil;        //1: Soltero/a    2: Casado/a       3: Viudo/a
    private Fecha fecha = new Fecha();

    public Persona() {
    }

    public Persona(String nombre, int numDocumento, int estadoCivil, Fecha fecha) {
        this.nombre = nombre;
        this.numDocumento = numDocumento;
        this.estadoCivil = estadoCivil;
        this.fecha = fecha;
    }
    public Persona(Persona p) {
        this.nombre = p.getNombre();
        this.numDocumento = p.getNumDocumento();
        this.estadoCivil = p.getEstadoCivil();
        this.fecha = p.getFecha();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(int numDocumento) {
        this.numDocumento = numDocumento;
    }

    public int getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(int estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", numDocumento=" + numDocumento + ", estadoCivil=" + estadoCivil + ", Fecha de nacimiento" + fecha + '}';
    }
    
    
}