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
public class Autos extends Vehiculos {
    private int cantPasajeros;
    
    public Autos(int numMotor, String marca, int anio, double precio, int cantPasajeros){
        super(numMotor, marca, anio, precio);
        this.cantPasajeros=cantPasajeros;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    @Override
    public String toString() {
        return "Autos{" + "cantPasajeros=" + cantPasajeros + ", Numero Motor="+ super.getNumMotor()+",marca="+ super.getMarca()+ ", año="+ super.getAnio()+ ", precio="+ super.getPrecio()+'}';
    }
    
    
}
