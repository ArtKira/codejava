/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author Arturo
 */
public class Fibonacci {


    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        int fin, n1=1, n2=0, su = 0;
        int i=1;
        System.out.println("Ingresa el numero maximo de tu serie ");
        entrada=bufer.readLine();
        fin=Integer.parseInt(entrada);
        while(i<=fin){
            su=n1+n2;
            n1=n2;
            n2=su;
            i++;
            System.out.println("la serie es "+ su);
        }
      
    }
    
}
