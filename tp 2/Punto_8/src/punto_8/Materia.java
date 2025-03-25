/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_8;

/**
 *
 * @author agusg
 */
public class Materia {
    private String nombre;
    private int año, cantEstudiantes, cuatrimestre;
    private static int cantMaterias = 0;

    public Materia() {
    }

    public Materia(String nombre, int año, int cantEstudiantes, int cuatrimestre) {
        this.nombre = nombre;
        this.año = año;
        this.cantEstudiantes = cantEstudiantes;
        this.cuatrimestre = cuatrimestre;
        cantMaterias++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getCantEstudiantes() {
        return cantEstudiantes;
    }

    public void setCantEstudiantes(int cantEstudiantes) {
        this.cantEstudiantes = cantEstudiantes;
    }

    public int getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(int cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public static int getCantMaterias() {
        return cantMaterias;
    }

    @Override
    public String toString() {
        return "Nombre= " + nombre + ", Anio= " + año + ", Estudiantes=  " + cantEstudiantes + ", Cuatrimestre= " + cuatrimestre + '}';
    }
    
    
}
