/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_5;

/**
 *
 * @author Usuario
 */
public class Persona {
    private String nombre, tipoDocumento;
    private int numDocumento;
    private int estadoCivil;        //1: Soltero/a    2: Casado/a       3: Viudo/a
    private int dia, mes, anio;     //Fecha de nacimiento

    public Persona() {
    }

    public Persona(String nombre, String tipoDocumento, int numDocumento, int estadoCivil, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.numDocumento = numDocumento;
        this.estadoCivil = estadoCivil;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
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

    @Override
    public String toString() {
        return "Persona{" + "nombre= " + nombre + " | tipoDocumento= " + tipoDocumento + " | numDocumento= " + numDocumento + " | estadoCivil= " + estadoCivil + " | Fecha de nacimiento= " + dia + "/" + mes + "/" + anio + '}';
    }
    
    
}
