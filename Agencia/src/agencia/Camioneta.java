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
public class Camioneta extends Vehiculos {
    private int carga;
    private int ejes;
    private int rodada;
    
    public Camioneta (int numMotor, String marca, int anio, double precio, int car, int ejes, int roda){
        super(numMotor, marca, anio, precio);
        this.carga=car;
        this.ejes=ejes;
        this.rodada=roda;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public int getRodada() {
        return rodada;
    }

    public void setRodada(int rodada) {
        this.rodada = rodada;
    }

    @Override
    public String toString() {
        return "Camioneta{" + "carga=" + carga + ", ejes=" + ejes + ", rodada=" + rodada + ", Numero Motor="+ super.getNumMotor()+",marca="+ super.getMarca()+ ", año="+ super.getAnio()+ ", precio="+ super.getPrecio()+ '}';
    }
    
}
