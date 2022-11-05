/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagosemanal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Arturo
 */
public class Pagosemanal {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        int op = 0, hrs, re = 0, sin = 0;
        float pago1 = 0, pago2;
        System.out.println("SI ERES TRABAJADOR DE PRODUCCION INGRESA 1, SI ERES ADMINISTRATIVO INGRESA 2");
        entrada=bufer.readLine();
        op=Integer.parseInt(entrada);
        if(op==1){
            System.out.println("Ingresa las horas trabajadas");
            entrada=bufer.readLine();
            hrs=Integer.parseInt(entrada);
            if(hrs>=40){
                System.out.println("NO PUDEN SER MAYOR A 40");
            }else{
                System.out.println("Si tienes retardos ingresa 3, si no ingresa 1");
                entrada=bufer.readLine();
                re=Integer.parseInt(entrada);
                if (re==3){
                    pago1=hrs*200;
                }else{
                    pago1=hrs*200+100;
                }
            }
        }else{/*ADMINISTRATIVO*/
            System.out.println("Ingrese sus horas");  
            entrada=bufer.readLine();
            hrs=Integer.parseInt(entrada);
            if(hrs>=40){
                System.out.println("LAS HORAS SON MAYORES A 40");
            }else{
                System.out.println("Si tienes retardos ingresa 3, si no ingresa 1");
                entrada=bufer.readLine();
                re=Integer.parseInt(entrada);
                if (re==3){
                    pago1=hrs*100;
                }else{
                    pago1=hrs*100+100;
                }
                
            }
        }            
        System.out.println("SI ERES SINDICALIZADO INGRESA, 4");
        entrada=bufer.readLine();
        sin=Integer.parseInt(entrada);
         if(sin==4){
            pago2=pago1-50;
            System.out.println("TU SALDO SINDICALIZADO " + pago2);
            }
        System.out.println("TU PAGO ES" + pago1);
     
  }
}
    
