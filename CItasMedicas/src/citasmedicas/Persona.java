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
public class Persona {
    private String nombre;
    private String domicilio;
    private String telefono;
    private String email;
    //constructor vacio
    public Persona(){
    }
    //constructor con el nombre para recibir el nombre 
    public Persona(String n){
        this.nombre=n;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", domicilio=" + domicilio + ", telefono=" + telefono + ", email=" + email + '}';
    }
    
    
}
