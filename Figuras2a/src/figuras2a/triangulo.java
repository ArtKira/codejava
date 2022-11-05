/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras2a;

/**
 *
 * @author Arturo
 */
public class triangulo extends figura{
    private double base;
    private double altura;
    private double area;
    
    public triangulo(String c, double b, double a){
        super(c);
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
        this.area=this.base*this.base/2;
        return this.area;
    }

    @Override
    public String toString() {
        return "triangulo{" + "base=" + base + ", altura=" + altura + ", area=" + area + '}';
    }
    
    
}
