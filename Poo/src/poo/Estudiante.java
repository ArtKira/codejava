/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Arturo
 */
public class Estudiante {
    //las propiedades de la clase o atributos 
    private String matricula;
    private String nombre;
    private String carrera;
    private int cuatrisemestre;
    private char grupo;
    private double adeudo=1060;
    //constructor basio 
    public Estudiante(){
        
    }
    //constructor para darle nombre al estudiante 
    public Estudiante (String n){
        this.nombre=n;
    }
    //con mas 
    public Estudiante (String n, double ad){
        this.nombre=n;
        this.adeudo=ad;
    }
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getCuatrisemestre() {
        return cuatrisemestre;
    }

    public void setCuatrisemestre(int cuatrisemestre) {
        this.cuatrisemestre = cuatrisemestre;
    }

    public char getGrupo() {
        return grupo;
    }

    public void setGrupo(char grupo) {
        this.grupo = grupo;
    }

    public double getAdeudo() {
        return adeudo;
    }

    public void setAdeudo(double adeudo) {
        this.adeudo = adeudo;
    }
    
    
    
    public void pagarAdeudo(double pago){
        this.adeudo-=pago;
    }
    
    public void reprtarAdeudo(){
        System.out.println("el adeudo del estudiante  "+ this.nombre + "es "+ this.adeudo);
    }
    //se cambia el comporatmiento para imprimer las demas variables 
    //avisamos que vamos a sobre escribir un metodo 
    @Override
    public String toString() {
        return "Estudiante{" + "matricula=" + matricula + ", nombre=" + nombre + ", carrera=" + carrera + ", cuatrisemestre=" + cuatrisemestre + ", grupo=" + grupo + ", adeudo=" + adeudo + '}';
    }
    
}
