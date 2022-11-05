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
public class TestingReporteAdeudos {
    public static void main(String[] args) {
        //se declara objeto de clase estudiante 
        Estudiante arturo;
        //construir el objeto 
        arturo= new Estudiante();
        
        //forms para asiganar valores a las variables 
        //arturo.nombre= "Arturo Sanchez";
        //forma 2 para asiganr valores a variables 
        arturo.setNombre("Arturo Sanchez");
        arturo.setCarrera("TI AIRD");
        arturo.setCuatrisemestre(2);
        arturo.setGrupo('A');
        arturo.setMatricula("2021ITI003");
        //recuper los dats de las variables 
        System.out.println("el nombre del estudainte es "+ arturo.getNombre());
        System.out.println("El nombre de la carrera es "+ arturo.getCarrera());
        System.out.println("El Cuatrisemestre es "+ arturo.getCuatrisemestre());
        System.out.println("El grupo es "+ arturo.getGrupo());
        System.out.println("La matricula del estudiante es "+ arturo.getMatricula());
        //se manda a llamar al metodo de la clase estudiante 
        arturo.reprtarAdeudo();
        //crear otro objeto de estudiante 
        //se puede declarar y construir en la mima liena 
        Estudiante guadalupe= new Estudiante("Guadalupe Montes"); 
        guadalupe.reprtarAdeudo();
        System.out.println("El nombre del estidiante es "+ guadalupe.getNombre());
        System.out.println("La informacion del estudainte es "+ guadalupe.toString());//hereda de object
        
        
    }
}
