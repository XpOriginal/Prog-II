/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplointerfazgrafica;
import Vista.FormularioEstudianteADistancia;
import Controlador.EstudianteADistanciaController;
import java.util.ArrayList;
import Modelo.EstudianteADistancia;
import java.util.List;
/**
 *
 * @author Usuario
 */
public class EjemploInterfazGrafica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List <EstudianteADistancia> listaEADMain = new ArrayList<>();
        EstudianteADistanciaController controladorEAD = new EstudianteADistanciaController(listaEADMain);
        
        
        
        FormularioEstudianteADistancia ventana = new FormularioEstudianteADistancia(controladorEAD);
        ventana.setVisible(true);
        
    }
    
}
