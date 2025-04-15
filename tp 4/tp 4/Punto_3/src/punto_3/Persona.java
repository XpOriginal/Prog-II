/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_3;

/**
 *
 * @author agusg
 */
public abstract class Persona {
    private String nombre;
    private int dni;
    private int estadoCivil;
    private String titulo;


    public Persona(String nombre, int dni, int estadoCivil) {
        this.nombre = nombre;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
    }
    
    public Persona(Persona p) {
        this.nombre = p.getNombre();
        this.dni = p.getDni();
        this.estadoCivil = p.getEstadoCivil();
    }
    
    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(int estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo; 
    }
    
    abstract String titulo();
    
    public String getNombreTitulo(){
        return titulo() + " " + nombre;
    }
    
    
}