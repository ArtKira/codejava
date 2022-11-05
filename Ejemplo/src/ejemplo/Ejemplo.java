/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Arturo
 */
public class Ejemplo {
   public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
   public static String entrada;
   public static int area;
    //mrtodo 
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
   //metodo pago de la hora 
   public static double pagaHora(){
       double pagoHora=0;
       switch( area ){
            case 1: pagoHora = 160;
                    break;
            case 2: pagoHora = 120;
                    break;
            case 3: pagoHora = 100;
                    break;
            case 4: pagoHora = 80;
                    break;
            case 5: pagoHora = 120;
            }
       return pagoHora;
   }
   
   //metodo para retardos 
   public static double retardos() throws IOException{
       double descuentoPorRetardos;
       int retardos;
       System.out.println("Escribe el número de retardos por semana: ");
       entrada = bufer.readLine();
       retardos = Integer.parseInt(entrada);
       if ( retardos >= 3 )
            descuentoPorRetardos = 100;
        else 
            descuentoPorRetardos = 0;
       return descuentoPorRetardos;
   }
   
   //metodo FALTAS 
   public static double descuentoFaltas() throws IOException{
       int faltas;
       double descuentoPorFaltas;
       double sueldoBase=0;
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
   
   public static double porAntiguedad() throws IOException{
       char antiguedad;
       double bonoAntiguedad;
      System.out.println("Tienes 5 o más años trabajando en la empresa? (S/N): ");
      entrada = bufer.readLine();
      antiguedad = entrada.toUpperCase().charAt(0);
      if (antiguedad == 'S')
        bonoAntiguedad = 200;
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
     //   int retardos;
       // int faltas;
        double pagoHora;
        double sueldoBase;
        int horas;
       // int area;
        double descuentoPorRetardos;
        double descuentoPorFaltas;
        double bonoAntiguedad;
        double sueldoTotal;
     //   char antiguedad;
        char respuesta;
        
        
        do{
            imprimeMenu();
            entrada = bufer.readLine();
            area = Integer.parseInt(entrada);
        
            pagoHora=pagaHora();
        
            System.out.println("Escribe el total de horas trabajadas a la semana: ");
            entrada = bufer.readLine();
            horas = Integer.parseInt(entrada);
            sueldoBase = horas * pagoHora;
        
           
            descuentoPorRetardos=retardos();
        
            
            descuentoPorFaltas=descuentoFaltas();
            
            bonoAntiguedad=porAntiguedad();
            
            
            sueldoTotal = sueldoBase - descuentoPorRetardos - descuentoPorFaltas + bonoAntiguedad;
            
            System.out.println("El sueldo total semanal es: " + sueldoTotal);
            
            System.out.println("Calcular otro salario? (S/N): ");
            entrada = bufer.readLine();
            respuesta = entrada.toUpperCase().charAt(0);
        } while (respuesta == 'S');
        
    }
    
}
