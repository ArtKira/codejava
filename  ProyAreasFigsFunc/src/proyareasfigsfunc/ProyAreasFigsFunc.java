/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyareasfigsfunc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author gabyn
 */
public class ProyAreasFigsFunc {
    //declaramos variables globales 
   public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
   public static String entrada;
    
    public static void calcularAreaTriangulo() throws IOException {
        //este es un metodo 
        double b, a, area;
        System.out.println("Escriba el valor de la base: ");
        entrada = bufer.readLine();
        b = Double.parseDouble(entrada);
        System.out.println("Escriba el valor de la altura: ");
        entrada = bufer.readLine();
        a = Double.parseDouble(entrada);
        area = b * a / 2;
        System.out.println("El area del triangulo es: " + area);
    }
    public static double calcularAreaCirculo() throws IOException {
        double area, r;
        System.out.println("Escriba el valor del radio: ");
        entrada = bufer.readLine();
        r = Double.parseDouble(entrada);
        area = 3.1416 * r * r; 
        return area;
    }
    public static void calcularAreaCuadrado() throws IOException{
        double lado, area;
        System.out.println("Escriba el valor del lado: ");
        entrada = bufer.readLine();
        lado = Double.parseDouble(entrada);
        area = lado * lado;
        System.out.println("El area del cuadrado es: " + area);
    } 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        double area, r, lado, resultado;
        int opcion;
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Programa que calcula areas");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Triangulo");
        System.out.println("2. Circulo");
        System.out.println("3. Cuadrado");
        System.out.println("Escriba una opcione (1/3):");
        entrada = bufer.readLine();
        opcion = Integer.parseInt(entrada);
        switch (opcion){
            case 1: {
                calcularAreaTriangulo();//estamos mandando a llamar el metodo 
            }
            break;
 
           case 2: {
               resultado=calcularAreaCirculo();//los metodos se llaman 
               System.out.println("El area del circulo es: " + resultado);
            }
            break;
            case 3: {
                calcularAreaCuadrado();
            }
            break;  
            default:
                System.out.println("Opcion  no valida");
        }
        
    }
    
}
