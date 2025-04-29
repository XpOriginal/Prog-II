/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class EstudianteADistancia extends Estudiante{
    private String ciudad;
    private String usuario, contraseña;

    public EstudianteADistancia() {
    }

    public EstudianteADistancia(Persona p, Estudiante e) {
        super(p, e);
    }
    
    public EstudianteADistancia(String ciudad, String usuario, String contraseña, Persona p, Estudiante e) {
        super(p, e);
        this.ciudad = ciudad;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + apellido + "/n Tipo Documento: " + tipoDocumento + "/n Numero de Documento: " + numDocumento + "/n Estado Civil: " + estadoCivil;
    }
    
    
}
