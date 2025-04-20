/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_11;

/**
 *
 * @author donjo
 */
public class ComponenteDeCoche {
    private String descripcion;
    private float peso, coste;

    public ComponenteDeCoche() {
    }

    public ComponenteDeCoche(String descripcion, float peso, float coste) {
        this.descripcion = descripcion;
        this.peso = peso;
        this.coste = coste;
    }
    
    public ComponenteDeCoche(ComponenteDeCoche c){
        this.descripcion = c.getDescripcion();
        this.peso = c.getPeso();
        this.coste = c.getCoste();
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getCoste() {
        return coste;
    }

    public void setCoste(float coste) {
        this.coste = coste;
    }
    
    @Override
    public String toString(){
        return "Descripcion: " + descripcion + " | Peso (KG): " + peso + " | Coste (U$D): " + coste;
    }
}
