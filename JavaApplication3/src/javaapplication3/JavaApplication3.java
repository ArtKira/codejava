/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Arturo
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO 
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada; 
        //leer 
        int x;
        String nombre;
        boolean y;
        float a;
        double i;
        System.out.println("ESCRIBE UN NUMERO ENTERO: ");//pide el numero y lo lee transforma 
        entrada=bufer.readLine();
        x= Integer.parseInt(entrada);
        System.out.println("EL NUMERO DE X ES "+ x);
        
        //para string 
        System.out.println("ESCRIBE EL NOMBRE DE TU PERRO: ");
        entrada=bufer.readLine();
        nombre=entrada;//le esta asignando la entrada no se reuiere convertir
        System.out.println("EL NOMBRE ES "+ nombre);
       
        //boolean 
        System.out.println("INGRESA EL VALOR: ");
        entrada=bufer.readLine();
        y=Boolean.parseBoolean(entrada);
        System.out.println("EL RESULTADO ES "+ y);
        
        //FLOAT
        System.out.println("INGRESA UN VALOR FLOTANTE: ");
        entrada=bufer.readLine();
        a=Float.parseFloat(entrada);
        System.out.println("EL RESULTADO ES: "+ a);
        
        //double 
        System.out.println("ESCRIBA UNA VARIABLE DOUBLE: ");
        entrada=bufer.readLine();
        i=Double.parseDouble(entrada);
        System.out.println("EL RESULTADO ES: "+ i);
    }
    
}
