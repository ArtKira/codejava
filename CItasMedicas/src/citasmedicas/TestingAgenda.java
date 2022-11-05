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
public class TestingAgenda {
    public static void main(String[] args) {
        Persona unapersona=new Persona("Arturo");
        Paciente unpaciente=new Paciente("Refugio", 20, "artu.thesanchez.com");
        unpaciente.setTelefono("2471183619");
        unpaciente.setDomicilio("San Francisco");
        unpaciente.setSintomas("Tos, Fatiga, Perdida de olfato");
        unpaciente.setPeso(60.2);
        unpaciente.setEstatura(1.69);
        
        
        System.out.println("Informacion de unapersona "+ unapersona.toString());
        System.out.println("");
        System.out.println("informacion de unpaciente "+ unpaciente.toString());
    }
}
