/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_10;

/**
 *
 * @author agusg
 */
public class Usuario{
    private String nombre, apellido;
    private String ocupacion;
    private String carrera;
    private String mail;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String ocupacion, String carrera, String mail) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ocupacion = ocupacion;
        this.carrera = carrera;
        this.mail = mail;
    }
    
    public Usuario(Usuario u){
        this.nombre = u.getNombre();
        this.apellido = u.getApellido();
        this.ocupacion = u.getOcupacion();
        this.carrera = u.getCarrera();
        this.mail = u.getMail();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", ocupacion=" + ocupacion + ", carrera=" + carrera + ", mail=" + mail + '}';
    }
    
    
}
