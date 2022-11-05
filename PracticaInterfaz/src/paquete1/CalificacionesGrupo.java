/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author Arturo
 */
public class CalificacionesGrupo implements Relaciones{ 
    //Variables ID Alumno 
    private int A1=1;
    private int A2=2;
    private int A3=3;
    private int A4=4;
    private int A5=5;
    //Calificaciones 
    private int num1;
    private int num2;
    private boolean resultado;
    public CalificacionesGrupo(int n1, int n2){
        this.num1=n1;
        this.num2=n2;
    }

    public int getA1() {
        return A1;
    }

    public void setA1(int A1) {
        this.A1 = A1;
    }

    public int getA2() {
        return A2;
    }

    public void setA2(int A2) {
        this.A2 = A2;
    }

    public int getA3() {
        return A3;
    }

    public void setA3(int A3) {
        this.A3 = A3;
    }

    public int getA4() {
        return A4;
    }

    public void setA4(int A4) {
        this.A4 = A4;
    }

    public int getA5() {
        return A5;
    }

    public void setA5(int A5) {
        this.A5 = A5;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public boolean isResultado() {
        return resultado;
    }

    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }
    
    @Override
    public boolean esMenorQue(int n1, int n2){
        if (n1<n2)
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
    
    public boolean esDiferenteQue(int n1, int n2){
        if (n1!=n2)
            this.resultado=true;
        else 
            this.resultado=false;
        return this.resultado;
    }
}
