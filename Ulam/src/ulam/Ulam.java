/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Arturo
 */
public class Ulam {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        int num;
        System.out.println("ingresa un numero ");
        entrada=bufer.readLine();
        num=Integer.parseInt(entrada);
        
        if(num>0){
            do{
                System.out.println(""+num);
                if(num%2==0){
                    num=num/2;
                }else{
                    num=num*3+1;
                }
            }
            while(num!=1);
        }
        else
            System.out.println("El numero es neagitivo");
        
    }
    
}
