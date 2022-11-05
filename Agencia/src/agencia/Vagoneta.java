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
public class Vagoneta extends Vehiculos {
    private int cantpasajeros;
    
    public Vagoneta (int numMotor, String marca, int anio, double precio, int cantpasajeros){
        super(numMotor, marca, anio, precio);
        this.cantpasajeros=cantpasajeros;
    }

    public int getCantpasajeros() {
        return cantpasajeros;
    }

    public void setCantpasajeros(int cantpasajeros) {
        this.cantpasajeros = cantpasajeros;
    }

    @Override
    public String toString() {
        return "Vagoneta{" + "cantPasajeros=" + cantpasajeros + ", Numero Motor="+ super.getNumMotor()+",marca="+ super.getMarca()+ ", año="+ super.getAnio()+ ", precio="+ super.getPrecio()+'}';
    }

    
    
    
}
