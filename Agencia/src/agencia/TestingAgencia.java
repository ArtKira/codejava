/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencia;

/**
 *
 * @author Arturo
 */
public class TestingAgencia {
    public static void main(String[] args) {
        Autos autos1=new Autos(132, "Jetta", 218, 123423.50, 4);
        System.out.println("los datos del vehiculo son "+ autos1.toString());
        System.out.println("---------------------------------------------------------------------------------------------------------");
        Vagoneta vagoneta1 = new Vagoneta (232, "FORD", 2003, 65.5, 9);
        System.out.println("los datos de la vagoneta son "+ vagoneta1.toString());
        System.out.println("---------------------------------------------------------------------------------------------------------");
        Camioneta camioneta1=new Camioneta(342, "LOBO", 2020, 500000.0, 15, 2, 20);
        System.out.println("Los datos de la camioneta son "+ camioneta1.toString());
    }
}
