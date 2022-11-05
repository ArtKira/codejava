import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class numPru {

    
    public static void main(String[] args) throws IOException {
        // Declaración de variables
        int limInf, limSup;
        int sumaDiv, numero;
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        
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
            for ( int d = numero; d>=1; d--){
                if (numero%d == 0)
                    sumaDiv = sumaDiv + d;              
            }
            if ( sumaDiv == 2 * numero ){
                System.out.println("El numero: " + numero + " es perfecto");
                System.out.println("Porque sumaDiv = " + sumaDiv + " y es igual a " + (2*numero) );
            }
            if ( sumaDiv > 2 * numero ){
                System.out.println("El numero: " + numero + " es abundante");
                System.out.println("Porque sumaDiv = " + sumaDiv + " y es mayor a " + (2*numero));
            }
            if ( sumaDiv < 2*numero ) {
                System.out.println("El numero: " + numero + " es deficiente");
                System.out.println("Porque sumaDiv = " + sumaDiv + " y es menor a " + (2*numero));
            }
        }
        
        
        
    }
    
}