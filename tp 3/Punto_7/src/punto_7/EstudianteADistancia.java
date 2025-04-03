/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_7;

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

    @Override
    public String toString() {
        return super.toString() + "EstudianteADistancia{" + "ciudad=" + ciudad + ", usuario=" + usuario + ", contraseña=" + contraseña + '}';
    }
    
    
}
