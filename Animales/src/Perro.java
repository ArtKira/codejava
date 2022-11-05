/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arturo
 */
public class Perro extends Animal {
    public int anio=2;

    
    //DINAMICO 
    @Override
    public void raza() {
        System.out.println("SOY HUSKY");
    }
    public void comida(){
        System.out.println("CROQUETAS");
    }
    //ESTATICO
    public void comida(String micomida){
        System.out.println("Las croquetas que como son  "+micomida);
    }
    //ESTAIICO
    public void anios(){
        System.out.println("Tengo 2 año humano");
        anio=anio*7;
        System.out.println("En años perro es "+anio);
    }
    

}
