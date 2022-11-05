/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria2;


public class TestingReporteAnimales {
    public static void main(String[] args) {
        //creamos el objeto
        Animales perro;
        Animales hamster;
        Animales gato;
        perro= new Animales();
        gato=new Animales();
        hamster=new Animales();
        
        //asignamos valores 
        perro.setNombreAnimal("Boster");
        perro.setRaza("Chihuahua");
        perro.setTipoMascota("Perro");
        perro.setEdad(1);
        perro.setNombreDueño("DIEGO");
        //mandamos a imprimir 
        System.out.println("El nombre del animal es "+ perro.getNombreAnimal());
        System.out.println("La raza es "+ perro.getRaza());
        System.out.println("el tipo de animal es "+ perro.getTipoMascota());
        System.out.println("La edad es "+ perro.getEdad());
        System.out.println("El dueño es "+ perro.getNombreDueño());
        System.out.println("");
        System.out.println("");
        //asignamos valores 
        gato.setNombreAnimal("Gomas");
        gato.setTipoMascota("Gato");
        gato.setEdad(3);
        gato.setNombreDueño("DANIEL");
         //mandamos a imprimir 
        System.out.println("El nombre del animal es "+ gato.getNombreAnimal());
        System.out.println("el tipo de animal es "+ gato.getTipoMascota());
        System.out.println("La edad es "+ gato.getEdad());
        System.out.println("El dueño es "+ gato.getNombreDueño());
        System.out.println("");
        System.out.println("");
        //asignamos valores 
        hamster.setNombreAnimal("Dientes");
        hamster.setTipoMascota("Hamster");
        hamster.setEdad(1);
        hamster.setNombreDueño("DENISSE");
        //mandamos a imprimir 
        System.out.println("El nombre del animal es "+ hamster.getNombreAnimal());
        System.out.println("el tipo de animal es "+ hamster.getTipoMascota());
        System.out.println("La edad es "+ hamster.getEdad());
        System.out.println("El dueño es "+ hamster.getNombreDueño());
    }
}
