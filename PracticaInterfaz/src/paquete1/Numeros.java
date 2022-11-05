/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author AlumnoTI
 */
public class Numeros implements Relaciones{
    private int numero1;
    private int numero2;
    private boolean resultado;
    
    public Numeros (int n1, int n2){
        this.numero1=n1;
        this.numero2=n2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public boolean getResultado() {
        return resultado;
    }

    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }
    
    
    @Override
    public boolean esMenorQue(int n1, int n2){
        if(n1<n2)
           this.resultado=true;
        else 
           this.resultado=false;
        return this.resultado;
    }
    
    @Override
    public boolean esMayorQue(int n1, int n2){
        if (n1>n2)
           this.resultado=true;
        else 
           this.resultado=false;   
        return this.resultado;
    }
    
    @Override
    public boolean esIgualQue(int n1, int n2){
        if (n1==n2)
            this.resultado=true;
        else
            this.resultado=false;
        return this.resultado;
    }
    
    @Override
    public boolean esDiferenteQue(int n1, int n2){
        if (n1!=n2)
            this.resultado=true;
        else 
            this.resultado=false;
        return this.resultado;
    }
    
}
