/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_8;

/**
 *
 * @author agusg
 */
public class CuentaCorriente extends Cuenta{
    private static double interesFijo = 0.015;
    
    public CuentaCorriente() {
    }

    public CuentaCorriente(Cuenta c) {
        super(c);
    }

    @Override
    public boolean retirar(double x){
        if(x > super.getSaldo()){
            return false;
        }else{
            x = super.getSaldo() - x;
            super.setSaldo(x);
            return true;
        }  
    }
    
    @Override
    public void actualizarSaldo(){
        super.setSaldo(super.getSaldo() * interesFijo);
    }
    
    @Override
    public String tipoCuenta(){
        return "Cuenta Corriente";
    }
}
