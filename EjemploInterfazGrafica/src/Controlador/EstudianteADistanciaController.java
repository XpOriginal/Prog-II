/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.EstudianteADistancia;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Usuario
 */
public class EstudianteADistanciaController {
    private EstudianteADistancia estudianteADistancia;
    private List<EstudianteADistancia> listaEAD;

    public EstudianteADistanciaController() {
    }

    public EstudianteADistanciaController(EstudianteADistancia estudianteADistancia) {
        this.estudianteADistancia = estudianteADistancia;
    }

    public EstudianteADistanciaController(List<EstudianteADistancia> listaEAD) {
        this.listaEAD = listaEAD;
    }

    public List<EstudianteADistancia> getListaEAD() {
        return listaEAD;
    }

    public void setListaEAD(List<EstudianteADistancia> listaEAD) {
        this.listaEAD = listaEAD;
    }
    
    public void setNombre(String nombre){
        estudianteADistancia.setNombre(nombre);
    }
    
    public String getNombre(){
        return estudianteADistancia.getNombre();
    }
    
    public void setApellido(String apellido){
        estudianteADistancia.setApellido(apellido);
    }
    
    public String getApellido(){
        return estudianteADistancia.getApellido();
    }
    
    public void setTipoDocumento(String tipoDocumento){
        estudianteADistancia.setTipoDocumento(tipoDocumento);
    }
    
    public String getTipoDocumento(){
        return estudianteADistancia.getTipoDocumento();
    }
    
    public void setNumDocumento(String numDocumento){
        estudianteADistancia.setNumDocumento(numDocumento);
    }
    
    public String getNumDocumento(){
        return estudianteADistancia.getNumDocumento();
    }
    
    public void setEstadoCivil(String estadoCivil){
        estudianteADistancia.setEstadoCivil(estadoCivil);
    }
    
    public String getEstadoCivil(){
        return estudianteADistancia.getEstadoCivil();
    }
    
    public EstudianteADistancia getEstudianteADistancia(){
        return estudianteADistancia;
    }

    @Override
    public String toString() {
        return "Nombre: " + estudianteADistancia.getNombre() + " " + estudianteADistancia.getApellido() + "/n Tipo Documento: " + estudianteADistancia.getTipoDocumento() + "/n Numero de Documento: " + estudianteADistancia.getNumDocumento() + "/n Estado Civil: " + estudianteADistancia.getEstadoCivil();
    }
    
    
}
