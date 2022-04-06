/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

/**
 *
 * @author Joshua 
 */
public class Avanzado {
    
    public double factorial(int num){ 
        long fact = 1;
        for(int i = 2; i <= num; i++){
            fact = fact * i;
        }
        return(fact);    
    }
    public double logaritmo(int num){
        return Math.log10(num);
    }
    public double potencia(int base, int elevacion){
        return Math.pow(base, elevacion);
    }
    public double raizcuadrada(int base){
        return Math.sqrt(base);
    }
    public double raizcubica(int base){
        return Math.cbrt(base);
    
}

}