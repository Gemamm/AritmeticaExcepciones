
package aritmetica;

import Excepciones.OperacionExcepction;


public class Aritmetica {
    
    public static int division(int numerador, int denominador)throws OperacionExcepction{
        if(denominador == 0){
            throw new OperacionExcepction("Dovision entre cero");
        }
        return numerador / denominador;
    }
    
}
