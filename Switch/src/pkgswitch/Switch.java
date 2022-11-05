/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Arturo
 */
public class Switch {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        int horas=0, op=0;
        String entrada;
        float pago, bono = 0;
        char caracter;
        System.out.println("INGRESA 1 SI ERES TRABAJADOR DE PRODUCCION, SI ERES ADMINISTRATIVO INGRESA 2: ");
        entrada = bufer.readLine();
        op=Integer.parseInt(entrada);
        
        if(op==1){
            System.out.println("TRABAJADOR PRODUCCCION INGRESA LAS HORAS TRBAJADAS: ");
            entrada = bufer.readLine();
            horas=Integer.parseInt(entrada);
            pago=horas*80;
        }else{
            System.out.println("TRABAJADOR ADMINISTRATIVO INGRESA LAS HORAS TRBAJADAS: ");
            entrada = bufer.readLine();
            horas=Integer.parseInt(entrada);
            pago=horas*60;
        }if(horas<60){
            System.out.println("LAS HORAS SON MENORES A 60");
        }
        System.out.println("SI trabajste horas extras en los dias:\n a. El lunes se paga un bono de 100\n" +
"     b. El martes y el miércoles no se paga tiempo extra\n" +
"     c. El jueves se paga un bono de 50\n" +
"     d. El viernes se paga un bono de 250\n" +
"     e. El sábado se paga un bono de 400\n" +
"     f. El domingo se paga un bono de 500\n ingresa la opcion deseada");
        entrada = bufer.readLine();
        caracter = entrada.charAt(0);
        switch(caracter){
            case 'a' : bono=pago+100;
            break;
            case 'b': System.out.println("EL MARTES Y MIERCOLES NO SE PAGA EXTRA");
            break;
            case 'c': bono=pago+50;
            break;
            case 'd': bono =pago+250;
            break;
            case 'e': bono=pago+400;
            break;
            case 'f': bono=pago+500;
            break;
            default: System.out.println("NO TIENES HORAS EXTRAS");
        }
        System.out.println("El pago es de: " + pago);
        System.out.println("El bono conforme el dia es de: " + bono);
        
    }
    
}
