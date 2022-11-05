/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citasmedicas;

/**
 *
 * @author Arturo
 */
//estamos indicando la calase que hereda 
public class Paciente extends Persona {
    private int edad;
    private String sintomas;
    private double peso;
    private double estatura;
    
    public Paciente(String nombre, int edad, String e ){
        super(nombre);//herda llamado del constructor 
        this.edad=edad;
        super.setEmail(e);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return super.toString() + "Paciente{" + "edad=" + edad + ", sintomas=" + sintomas + ", peso=" + peso + ", estatura=" + estatura + '}';
    }
    
    
}
