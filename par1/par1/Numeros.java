import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Numeros {
//EJEMPLO DE PARAMETRO Y REGRESA VALORES
//Un parametro es un valor que le prestan o mas bien es un valor de copia
    public static int obtenerSumaDivisores(int numero){
        int sumaDiv=0;
        for ( int d = numero; d>=1; d--){
            if (numero%d == 0)
                sumaDiv = sumaDiv + d;              
        }
        return sumaDiv;

    }
//Para saber si es perfecto
    public static boolean esPerfecto(int suma, int num){
       /*boolean resultado;
       Ejemplo 1
        if(suma==2 *num){
            resultado = true;
        }else{
            resultado = false;
        }
        return resultado;
        
        Ejemplo 2 Sin usar la variable return
        if(suma==2 *num){
            return=true;
        }else{
            return = false;
        }
        Ejemplo 3 Sin utlizar if
        return suma==2*num;
        */
        return suma == 2 * num;
    }
    public static boolean esAbundante(int suma, int num){
        return suma > 2 * num;
    }
    public static boolean esDeficiente(int suma, int num){
        return suma < 2*num;
    }
  
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
            sumaDiv = obtenerSumaDivisores(numero);
        //Del metodo esPerfecto 
        
        /*
        Ejemplo 1 Forma larga usando una variable para almacenar el valor de regreso
        r = esPerfecto(numero,sumaDiv);
            if(r==true)
        Ejemplo 2
         r = esPerfecto(numero,sumaDiv);
            if(r)
            asi forma corta de valores falsos
            if(!r)
        Ejemplo 3
        
            if(esPerfecto(numero,sumaDiv))
            en caso de entero
            if(esPerfecto(numero,sumaDiv)==0)
            en caso de falso
            if(!esPerfecto(numero,sumaDiv))
        */
            
            if(esPerfecto(numero,sumaDiv)){
                System.out.println("El numero: " + numero + " es perfecto");
                System.out.println("Porque sumaDiv = " + sumaDiv + " y es igual a " + (2*numero) );
            }
            
            if (esAbundante(numero,sumaDiv)){
                System.out.println("El numero: " + numero + " es abundante");
                System.out.println("Porque sumaDiv = " + sumaDiv + " y es mayor a " + (2*numero));
            }
            if (esDeficiente(numero, sumaDiv)) {
                System.out.println("El numero: " + numero + " es deficiente");
                System.out.println("Porque sumaDiv = " + sumaDiv + " y es menor a " + (2*numero));
            }
        }
        
        
        
    }
    
}