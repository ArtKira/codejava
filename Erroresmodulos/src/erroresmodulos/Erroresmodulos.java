
package erroresModulos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author Gaby Nieva
 */
public class Erroresmodulos {
    
    
    public static double pies; 

 
    
    /*Método que regresa valores y recibe parámetros*/
    public static double convertir_m_pies(double m) {
     pies = m * 3.281;
     return pies;
    }
    
    
    /*Este método debe mantenerse como tipo void, sin argumentos */
   public static void convertir_km_millas() throws IOException  {
   
     
     BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        double km, millas;
        System.out.println("Escriba los km a convertir: ");
        entrada = bufer.readLine();
        km = Double.parseDouble(entrada);
        millas = km * 0.6214;
        System.out.println("El resultado de convertir " + km + " km a millas es: " + millas);
      
   }      
    
      /*Método que regresa valores y recibe parámetros*/
   public static double convertir_cm_pulgadas(double cm) {
     double pulgadas;
     pulgadas = cm * 0.393;
     return pulgadas;
    }
   
   /* Este método debe mantenerse como un método que regresa valores sin recibir parámetros */
    public static double convertir_ha_acres() throws IOException{
     String entrada;
     double  acres, ha;
     BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
     
        System.out.println("Escriba las hectareas a convertir: ");
        entrada = bufer.readLine();
        ha = Double.parseDouble(entrada);
        acres = ha * 2.4711;
        return acres;
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException  {
        // variables locales
       String entrada;
       BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
       int opcion;
       double r, valor;
       
        System.out.println("Programa de conversión de unidades");
        System.out.println("Menu de opciones");
        System.out.println("1. Convertir m a pies");
        System.out.println("2. Convertir km a millas");
        System.out.println("3. Convertir cm a pulgadas");
        System.out.println("4. Convertir ha a acres");
        System.out.println("Escribe tu seleccion:");
        entrada = bufer.readLine();
        opcion = Integer.parseInt(entrada);

        
        
        switch (opcion){
            case 1: { System.out.println("Escriba los metros a convertir: ");
                      entrada = bufer.readLine();
                      valor = Double.parseDouble(entrada);
                      r = convertir_m_pies(valor); 
                      System.out.println("El resultado de convertir m a pies es: " + r);
            }
                    break;
            case 2: { convertir_km_millas();            
            }
                    break;
            case 3: { System.out.println("Escriba los cm a convertir: ");
                      entrada = bufer.readLine();
                      valor = Double.parseDouble(entrada);
                      r = convertir_cm_pulgadas(valor);
                      System.out.println("El resultado de convertir cm a pulgadas es: " + r);
            
            }
                    break;
            case 4: { 
                r=convertir_ha_acres();
            
                System.out.println("El resultado de convertir ha a acres es: " + r);
            
                      
        }
             break;
                default: System.out.println("Opcion incorrecta");
        
        
    }
        
}
    

