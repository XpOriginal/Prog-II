/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author agusg
 */


import java.time.temporal.ChronoUnit;
import java.time.LocalTime;

public class Fecha {
    
    private int dia, mes, año;
    
    public Fecha() {
    }

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public void mostrarFecha(){
        System.out.println(this.dia + "/" + this.mes + "/" + this.año);
    }
    
    public int cantDias(Fecha aux){
        LocalDate fecha1 = LocalDate.of(this.año, this.mes, this.dia);
        LocalDate fecha2 = LocalDate.of(this.año, this.mes, this.dia);
        
    }
}
