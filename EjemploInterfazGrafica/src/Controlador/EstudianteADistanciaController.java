/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.EstudianteADistancia;


/**
 *
 * @author Usuario
 */
public class EstudianteADistanciaController {
    private EstudianteADistancia estudianteADistancia;

    public EstudianteADistanciaController(EstudianteADistancia estudianteADistancia) {
        this.estudianteADistancia = estudianteADistancia;
    }
    
    public void setNombre(String nombre){
        estudianteADistancia.setNombre(nombre);
    }
    
    public void setApellido(String apellido){
        estudianteADistancia.setApellido(apellido);
    }
    
    public void setTipoDocumento(String tipoDocumento){
        estudianteADistancia.setTipoDocumento(tipoDocumento);
    }
    
    public void setNumDocumento(String numDocumento){
        estudianteADistancia.setNumDocumento(numDocumento);
    }
    
    public void setEstadoCivil(String estadoCivil){
        estudianteADistancia.setEstadoCivil(estadoCivil);
    }
}
