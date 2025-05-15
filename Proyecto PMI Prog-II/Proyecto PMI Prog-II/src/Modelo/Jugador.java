/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Jugador extends Persona{
    private String club;
    private int posicion;
    private int goles;
    private int tarjetasAmarillas;
    private static int tajetasRojas; 

    public Jugador() {
    }

    public Jugador(String club, int posicion, int goles, int tarjetasAmarillas, String nombre, String apellido, Fecha fechaNacimiento, String nacionalidad) {
        super(nombre, apellido, fechaNacimiento, nacionalidad);
        this.club = club;
        this.posicion = posicion;
        this.goles = goles;
        this.tarjetasAmarillas = tarjetasAmarillas;
    }

    public Jugador(String club, int posicion, int goles, int tarjetasAmarillas, Persona p) {
        super(p);
        this.club = club;
        this.posicion = posicion;
        this.goles = goles;
        this.tarjetasAmarillas = tarjetasAmarillas;
    }

    public Jugador(Persona p) {
        super(p);
    }
    
    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }

    public void setTarjetasAmarillas(int tarjetasAmarillas) {
        this.tarjetasAmarillas = tarjetasAmarillas;
    }

    public static int getTajetasRojas() {
        return tajetasRojas;
    }

    public static void sumarTajetasRojas() {
        Jugador.tajetasRojas++;
    }
    
    

    @Override
    public String imprimirNombre(){
        return this.getNombre() + " " + this.getApellido();
    }
    
    
    @Override
    public String toString() {
        return "Jugador{" + "club=" + club + ", posicion=" + posicion + ", goles=" + goles + ", tarjetasAmarillas=" + tarjetasAmarillas + '}';
    }
    
    
    
    
    
    
    
}
