/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_8;

/**
 *
 * @author agusg
 */
public abstract class Cuenta {
    private long numeroCuenta;
    private double saldo;
    private Persona cliente = new Persona();

    public Cuenta() {
    }

    public Cuenta(long numeroCuenta, Persona cliente) {
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
        this.saldo = 0.0;
    }
    
    public Cuenta(Cuenta c){
        this.cliente = c.getCliente();
        this.numeroCuenta = c.getNumeroCuenta();
        this.saldo = c.getSaldo();
    }
    
    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }
    
    public abstract boolean retirar(double x);
    public abstract void actualizarSaldo();
    
    
}
