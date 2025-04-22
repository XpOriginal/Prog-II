/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Persona {
    private String nombre, apellido;
    private String numDocumento;
    private String tipoDocumento;      //1: DNI          2: Pasaporte      3: Otro
    private String estadoCivil;        //1: Soltero/a    2: Casado/a       3: Viudo/a
    private Fecha fecha = new Fecha();

    public Persona() {
    }

    public Persona(String nombre, String apellido, String numDocumento, String tipoDocumento, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numDocumento = numDocumento;
        this.tipoDocumento = tipoDocumento;
        this.estadoCivil = estadoCivil;
    }
    
    public Persona(Persona p) {
        this.nombre = p.getNombre();
        this.numDocumento = p.getNumDocumento();
        this.estadoCivil = p.getEstadoCivil();
        this.fecha = p.getFecha();
        this.tipoDocumento = p.getTipoDocumento();
        this.apellido = p.getApellido();
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
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
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", numDocumento=" + numDocumento + ", tipoDocumento=" + tipoDocumento + ", estadoCivil=" + estadoCivil + ", fecha=" + fecha + '}';
    }

}
