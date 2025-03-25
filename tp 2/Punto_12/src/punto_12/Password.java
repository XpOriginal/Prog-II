/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_12;

/**
 *
 * @author Usuario
 */
public class Password {
    String contra;

    public Password() {
    }

    public Password(String contra) {
        this.contra = contra;
    }

    public String getContrasenia() {
        return contra;
    }

    public void setContrasenia(String contra) {
        this.contra = contra;
    }
    
    public boolean esSegura(){
        int cont_M = 0, cont_m = 0, cont_num = 0, aux = 0;
        
        
        for(int i = 0; i < this.contra.length(); i++){ 
            if(this.contra.charAt(i) >= 'A' && this.contra.charAt(i) <= 'Z' ){
                cont_M++;
            }
            if(this.contra.charAt(i) >= 'a' && this.contra.charAt(i) <= 'z' ){
                cont_m++;
            }
            if(this.contra.charAt(i) >= '0' && this.contra.charAt(i) <= '9' ){
                cont_num++;
            }
        }
        
        if(cont_M >= 2 && cont_m >= 1 && cont_num >= 3){
            return true;
        }
        else{
            return false;
        }
    }
}

