/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_12;

/**
 *
 * @author Usuario
 */
public class Empleado {
    private String nombre, dni;
    private int edad;
    private float salario;
    private boolean casado;

    public Empleado() {
    }

    public Empleado(String nombre, String dni, int edad, float salario, boolean casado) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.salario = salario;
        this.casado = casado;
    }
    
    public Empleado(Empleado e){
        this.nombre = e.getNombre();
        this.dni = e.getDni();
        this.edad = e.getEdad();
        this.salario = e.getSalario();
        this.casado = e.isCasado();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public void clasificacion(Empleado e){
        if(e.getEdad() <= 21)
            System.out.println("El empleado " + nombre + "es Principiante");
        
        if(e.getEdad() >= 22 || e.getEdad() <= 35)
            System.out.println("El empleado " + nombre + "es Intermedio");
        
        if(e.getEdad() > 35)
            System.out.println("El empleado " + nombre + "es Senior");
    }
    
    public void aumentarSalario(int porcentaje){
        this.salario = (this.salario * porcentaje) / 100;
    }
    
    @Override
    public String toString() {
        return "Empleado: " + nombre + " | DNI: " + dni + " | Edad: " + edad + " | Salario: " + salario + " | Casado: " + casado;
    }

    
    
}
