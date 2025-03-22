/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author agusg
 */
public class Fraccion {

        private float num, den;
        
        //Constructores
        public Fraccion(){
        }
        public Fraccion(float num, float den){
            this.den = den;
            this.num = num;
        }
        
        //Instancias (Obvservadores)
        public float getNum() {
            return num;
        }
        public float getDen() {
            return den;
        }
        public void setNum(float num) {
            this.num = num;
        }
        public void setDen(float den) {
            this.den = den;
        }

        
        public Fraccion sumar(Fraccion aux){
            Fraccion res = new Fraccion();
            
            float resNum = this.num * aux.getDen() + this.den * aux.getNum();
            float resDen = this.den * aux.getDen();
            
            res.setNum(resNum);
            res.setDen(resDen);
            
            return res;
       }
        public Fraccion restar(Fraccion aux){
            Fraccion res = new Fraccion();
            
            float resNum = this.num * aux.getDen() - this.den * aux.getNum();
            float resDen = this.den * aux.getDen();
            
            res.setNum(resNum);
            res.setDen(resDen);
            
            return res;
       }
       public Fraccion multiplicar(Fraccion aux){
           Fraccion res = new Fraccion();
           
           float resNum = this.num * aux.getNum();
           float resDen = this.den * aux.getDen();
           
           res.setNum(resNum);
           res.setDen(resDen);
           
           return res;
       }
       public Fraccion dividir(Fraccion aux){
           Fraccion res = new Fraccion();
           
           float resNum = this.num * aux.getDen();
           float resDen = this.den * aux.getNum();
           
           res.setNum(resNum);
           res.setDen(resDen);
           
           return res;
       }
    }
