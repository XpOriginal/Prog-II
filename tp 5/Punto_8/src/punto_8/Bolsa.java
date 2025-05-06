/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_8;
import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author Usuario
 */
public class Bolsa {
    List<Integer> conjunto;

    public Bolsa() {
        conjunto = new ArrayList<>();
    }
    
    public Bolsa(List<Integer> conjunto) {
        this.conjunto = conjunto;
    }

    public List<Integer> getConjunto() {
        return conjunto;
    }

    public void setConjunto(List<Integer> conjunto) {
        this.conjunto = conjunto;
    }

    @Override
    public String toString() {
        return "" + conjunto + "";
    }
}
