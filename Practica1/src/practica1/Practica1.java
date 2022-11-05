/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Arturo
 */
public class Practica1 {
   public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
   public static String entrada;
   //metodo imprime menu 
   public static void imprimeMenu(){
        System.out.println("Programa para calcular la nómina");
        System.out.println("Selecciona el área donde trabajas:");
        System.out.println("1 - Producción");
        System.out.println("2 - Mantenimiento");
        System.out.println("3 - Calidad");
        System.out.println("4 - Administración");
        System.out.println("5 - Sistemas");
        System.out.println("Escribe el número correspondiente: ");
   }
   public static double pagoHora(){
       double pagoHora;
       pagoHora = 160;
       return pagoHora;
   }
   //metodo por retardos 
   public static double descuentoPorRetardos() throws IOException{
        int retardos;
        double descuentoPorRetardos;
        System.out.println("Escribe el número de retardos por semana: ");
        entrada = bufer.readLine();
        retardos = Integer.parseInt(entrada);
        if ( retardos >= 3 ){
        descuentoPorRetardos = 100;
        }
        else 
        descuentoPorRetardos = 0;
        return descuentoPorRetardos;
   }
   //metodo descuento por faltas 
   public static double descuentoFaltas()throws IOException {
       int faltas;
       double descuentoPorFaltas, sueldoBase = 0;
       System.out.println("Escribe el número de faltas por semana: ");
       entrada = bufer.readLine();
       faltas = Integer.parseInt(entrada);
       if ( faltas > 0 ){
       descuentoPorFaltas = faltas * (sueldoBase * 0.10);
            }
            else
            descuentoPorFaltas = 0;
       return descuentoPorFaltas;
   }
   //metodo para antiguedad
   public static double bonoAntiguedad() throws IOException{
       int bonoAntiguedad;
       System.out.println("Tienes 5 o más años trabajando en la empresa? (S/N): ");
       entrada = bufer.readLine();
       char antiguedad = entrada.toUpperCase().charAt(0);
       if (antiguedad == 'S'){
       bonoAntiguedad = 200;
       }
        else 
           bonoAntiguedad = 0;
       return bonoAntiguedad;
   } 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        
        int retardos;
        int faltas;
        double pagoHora = 0, resultado = 0;
        double sueldoBase;
        int horas;
        int area;
        double descuentoPorRetardos,r1, r, r2;
        double descuentoPorFaltas;
        double bonoAntiguedad;
        double sueldoTotal;
        char antiguedad;
        char respuesta;
        
        
        do{
           imprimeMenu();
            entrada = bufer.readLine();
            area = Integer.parseInt(entrada);
        
            switch( area ){
            case 1: {
                resultado=pagoHora();
            }
                    break;
            case 2: pagoHora = 120;
                    break;
            case 3: pagoHora = 100;
                    break;
            case 4: pagoHora = 80;
                    break;
            case 5: pagoHora = 120;
            }
        
            System.out.println("Escribe el total de horas trabajadas a la semana: ");
            entrada = bufer.readLine();
            horas = Integer.parseInt(entrada);
        
            sueldoBase = horas * resultado;

            r1=descuentoPorRetardos();
            
            r=descuentoFaltas();
            
            r2=bonoAntiguedad();
        
            sueldoTotal = sueldoBase - resultado - r + r2;
            
            System.out.println("El sueldo total semanal es: " + sueldoTotal);
            
            System.out.println("Calcular otro salario? (S/N): ");
            entrada = bufer.readLine();
            respuesta = entrada.toUpperCase().charAt(0);
        } while (respuesta == 'S');
    }
    
}
