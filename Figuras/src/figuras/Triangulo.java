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
public class Triangulo extends Figura {
    private double base;
    private double altura;
    private double area;
    
    public Triangulo(String color, double b, double a){
        super(color);
        this.base=b;
        this.altura=a;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return calcularArea();
    }
    
 
    @Override
    public double calcularArea(){
        this.area=this.base * this.altura/2;
        return this.area;
    }

    @Override
    public String toString() {
        return "Triangulo {" + "base="+ base + ", altura="+ altura + ", area="+ area +", color=" + super.getColor()+"}";
    }


}
