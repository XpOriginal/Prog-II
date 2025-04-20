/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_11;

/**
 *
 * @author donjo
 */
public class PuertaCoche extends ComponenteDeCoche implements PuertaBloqueable, Alarma{
    private boolean puerta, estaBloqueada, alarma;

    public PuertaCoche() {
    }

    public PuertaCoche(ComponenteDeCoche c) {
        super(c);
    }

    public PuertaCoche(boolean puerta, boolean estaBloqueada, boolean alarma, ComponenteDeCoche c) {
        super(c);
        this.puerta = puerta;
        this.estaBloqueada = estaBloqueada;
        this.alarma = alarma;
    }
    
    public PuertaCoche(boolean puerta, boolean estaBloqueada, boolean alarma, String descripcion, float peso, float coste) {
        super(descripcion, peso, coste);
        this.estaBloqueada = estaBloqueada;
        this.puerta = puerta;
        this.alarma = alarma;
    }
    
    //METODOS HEREDADOS
    
    @Override
    public void bloquea(){
        estaBloqueada = true;
    }
    
    @Override
    public void desbloquea(){
        estaBloqueada = false;
    }
    
    @Override
    public String alarmaActivada(){
        if(alarma == false){
            return "La alarma esta desactivada";
        }else{
            return "La alarma esta activada";
        }
    }
    
    @Override
    public void activarAlarma(){
        alarma = true;
    }
    
    @Override
    public void desactivarAlarma(){
        alarma = false;
    }
    
    @Override
    public void abrir(){
        puerta = true;
    }
    
    @Override
    public void cerrar(){
        puerta = false;
    }
    
    //OBSERVADORES Y MODIFICADORES

    public boolean isPuerta() {
        return puerta;
    }

    public void setPuerta(boolean puerta) {
        this.puerta = puerta;
    }

    public boolean isEstaBloqueada() {
        return estaBloqueada;
    }

    public void setEstaBloqueada(boolean estaBloqueada) {
        this.estaBloqueada = estaBloqueada;
    }

    public boolean isAlarma() {
        return alarma;
    }

    public void setAlarma(boolean alarma) {
        this.alarma = alarma;
    }
    
    
}
