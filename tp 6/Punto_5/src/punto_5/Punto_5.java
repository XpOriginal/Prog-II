/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_5;

/**
 *
 * @author agusg
 */
public class Punto_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer numero = null;
        
        try{
            if(numero == null){
                throw new NullPointerException();
            }
            
        }catch(NullPointerException npe){
            
            System.out.println("Hay una variable NULL");
        }
        catch(RuntimeException rte){
            System.out.println("Se a producido un error");
            System.out.println(rte);
        }
    }
    
}
