/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_8;

/**
 *
 * @author agusg
 */
public class CuentaAhorro extends Cuenta{
    private float interes;
    private double saldoMinimo;

    public CuentaAhorro() {
    }

    public CuentaAhorro(Cuenta c) {
        super(c);
    }

    public CuentaAhorro(float interes, double saldoMinimo, Cuenta c) {
        super(c);
        this.interes = interes;
        this.saldoMinimo = saldoMinimo;
    }

    public float getInteres() {
        return interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }
    
    @Override
    public boolean retirar(double x){
        if(x > super.getSaldo() || x > saldoMinimo){
            return false;
        }else{
            super.setSaldo(x - super.getSaldo());
            return true;
        }
    }
    
    @Override
    public void actualizarSaldo(){
        super.setSaldo(super.getSaldo() * interes);
    }
    
    @Override
    public String tipoCuenta(){
        return "Cuenta Ahorro";
    }
}
