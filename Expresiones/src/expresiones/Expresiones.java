/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresiones;

/**
 *
 * @author Arturo
 */
public class Expresiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables 
        double a, b, c, x, y, w;
        // Valor 
        x=8;
        y=-2;
        a=10;
        b=3;
        c=4;
        
        //PRIMER EJERCICIO 
        w=(2*x*x+5)/3*x+y;
        System.out.println("EL RESULTADO ES: "+ w);
        
        //SEGUNDO EJERCICIO 
        w=2*a*a-3*b*b*c;
        System.out.println("EL RESULTADO ES: "+ w);
        
        //TERCER EJERCICIO
        w=15*(2*a/5*b-(a*a+2*b)-c);
        System.out.println("EL RESULTADO ES: "+ w);
        
        //CUarto EJERCICO 
        w=(2*x*x+5)/3*x+3*y/(6*x+y);
        System.out.println("EL RESULTADO ES: "+ w);
        
        //QUINTO EHJERCICIO 
        w=x*x*(2-y)/(3*x+y)+y*y*(2*x+3)/(3*x+3*y);
        System.out.println("EL RESULTADO ES: "+ w);
    }
    
}
