
package numeros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Gaby
 */
public class Numeros {
    //metodo que regresa valors y regresa un parametro 
    public static int obtenerSumaDivisiores(int numero){//este es un parametro 
        int sumaDiv=0;
        for ( int d = numero; d>=1; d--){
                if (numero%d == 0)
                    sumaDiv = sumaDiv + d;              
            }
        return sumaDiv;
    }
    
    public static boolean esPerfecto(int numero, int sumaDiv){
        //boolean resultado;
        //metodo menos largo sin la variable resultado 
       /* if ( sumaDiv == 2 * numero ){
            return true;
        }
        else{
            return false;
        }*/
       //ejemplo sin usar el if 
       return sumaDiv==2*numero;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // Declaración de variables
        int limInf, limSup;
        int sumaDiv, numero;
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        boolean r;
        
        // Pedir los límites de la lista de números
        System.out.println("Escribe el valor del límite inferior: ");
        entrada = bufer.readLine();
        limInf = Integer.parseInt(entrada);
        System.out.println("Escribe el valor del límite superior: ");
        entrada = bufer.readLine();
        limSup = Integer.parseInt(entrada);        
        
        // Procesando la lista de números
        for ( numero = limInf; numero<=limSup; numero++){
            // obtener la suma de divisores por cada numero
            sumaDiv = 0;
            
            sumaDiv=obtenerSumaDivisiores(numero);//numero es un argumento se lo lleva al metodo para saber que hacer
            //otro metodo
            //r=esPerfecto(numero, sumaDiv);
            //if sin variable solo con los metodos 
            if (esPerfecto(numero, sumaDiv)){
                System.out.println("El numero: " + numero + " es perfecto");
                System.out.println("Porque sumaDiv = " + sumaDiv + " y es igual a " + (2*numero) );
            }
            
            //abundante metodo y llamado 
            if ( sumaDiv > 2 * numero ){
                System.out.println("El numero: " + numero + " es abundante");
                System.out.println("Porque sumaDiv = " + sumaDiv + " y es mayor a " + (2*numero));
            }
            //metodo deficiente y llamado 
            if ( sumaDiv < 2*numero ) {
                System.out.println("El numero: " + numero + " es deficiente");
                System.out.println("Porque sumaDiv = " + sumaDiv + " y es menor a " + (2*numero));
            }
        }
        
        
        
    }
    
}