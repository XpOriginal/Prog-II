/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_12;

/**
 *
 * @author Usuario
 */
public class Programador extends Empleado{
    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;

    public Programador() {
    }

    public Programador(Empleado e) {
        super(e);
    }

    public Programador(int lineasDeCodigoPorHora, String lenguajeDominante, Empleado e) {
        super(e);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

    public int getLineasDeCodigoPorHora() {
        return lineasDeCodigoPorHora;
    }

    public void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }

    @Override
    public String toString() {
        return "Programador: " + super.getNombre() + " | DNI: " + super.getDni() + " | Edad: " + super.getEdad() + " | Salario: " + super.getSalario() + " | Casado: " + super.isCasado() + " | Lineas de codigo por hora: " + lineasDeCodigoPorHora + " | Lenguaje dominante: " + lenguajeDominante;
    }
    
    
}
