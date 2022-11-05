/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author Arturo
 */
public class Testingcalculararea {
    public static void main(String[] args) {
        Triangulo triangulo1=new Triangulo("rojo", 10.24, 13.24);
        System.out.println("El area del triangulo es "+ triangulo1.getArea());
        System.out.println("El area es "+ triangulo1.toString());
        System.out.println("");
        System.out.println("");
        Circulo circulo1=new Circulo("Naranja", 3.1416, 12.2);
        System.out.println("El area del circulo es "+circulo1.getArea());
        System.out.println("Los datos de la figura son "+ circulo1.toString());
    }
}
