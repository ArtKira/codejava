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
public class Circulo extends Figura{
    private double pi;
    private double radio;
    private double area;
    
    public Circulo(String c, double p, double r){
        super(c);
        this.pi=p;
        this.radio=r;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return calcularArea();
    }

  
    @Override
    public double calcularArea(){
    this.area=this.pi * this.radio * this.radio;
    return this.area;
    }

    @Override
    public String toString() {
        return "Circulo{" + "pi=" + pi + ", radio=" + radio + ", area=" + area + ", color=" + super.getColor()+ '}';
    }


    
    
}
