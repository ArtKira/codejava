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
public class TestingNumerosCalificaciones {
    public static void main(String[] args) {
        //NUMEROS
        Numeros numero=new Numeros(6, 3);
        System.out.println("EL NUMERO " + numero.getNumero1() + " ES MENOR QUE " + numero.getNumero2());
        boolean resultado=numero.esMenorQue(6, 3);
        System.out.println(resultado);
        
        Numeros numMayor=new Numeros(9, 3);
        System.out.println("eL NUMERO " + numMayor.getNumero1() + " ES MAYOR QUE " + numMayor.getNumero2());
        resultado=numMayor.esMayorQue(9, 3);
        System.out.println(resultado); 
     
        Numeros numIgual=new Numeros(10, 10);
        System.out.println("eL NUMERO " + numIgual.getNumero1() + " ES MAYOR QUE " + numIgual.getNumero2());
        resultado=numIgual.esIgualQue(10, 10);
        System.out.println(resultado); 
        
        Numeros numDiferente=new Numeros(8, 8);
        System.out.println("eL NUMERO " + numDiferente.getNumero1() + " ES MAYOR QUE " + numDiferente.getNumero2());
        resultado=numDiferente.esDiferenteQue(8, 8);
        System.out.println(resultado); 
        
        //ESTUDIANTES 
        String e1=" Paola ";
        String e2=" Juan ";
        String e3=" Denisse ";
        String e4=" Alfredo ";
        String e5=" Esmeralda ";
        
        CalificacionesGrupo alum =new CalificacionesGrupo(6, 9);
        System.out.println("EL ALUMNO " + alum.getA1() + e1 + " CON LA CALIFICACION " + alum.getNum1() + " ES MENOR QUE EL ESTUDIANTE " + alum.getA2() + e2 + " CON LA CALIFICACION " + alum.getNum2());
        resultado = alum.esMenorQue(6, 9);
        System.out.println(resultado);
        
        CalificacionesGrupo alum1 =new CalificacionesGrupo(9, 6);
        System.out.println("EL ALUMNO " + alum1.getA2() + e2 + " CON LA CALIFICACION " + alum1.getNum1() + " ES MAYOR QUE EL ESTUDIANTE " + alum1.getA3() + e3 + " CON LA CALIFICACION " + alum1.getNum2());
        resultado = alum1.esMayorQue(9, 6);
        System.out.println(resultado);
        
        CalificacionesGrupo alum2 =new CalificacionesGrupo(6, 6);
        System.out.println("EL ALUMNO " + alum2.getA3() + e3 + " CON LA CALIFICACION " + alum2.getNum1() + " ES IGUAL QUE EL ESTUDIANTE " + alum2.getA4() + e4 + " CON LA CALIFICACION " + alum1.getNum2());
        resultado = alum2.esIgualQue(6, 6);
        System.out.println(resultado);
        
        CalificacionesGrupo alum3 =new CalificacionesGrupo(6, 10);
        System.out.println("EL ALUMNO " + alum3.getA4() + e4 + " CON LA CALIFICACION " + alum3.getNum1() + " ES DIFERENTE QUE EL ESTUDIANTE " + alum3.getA5() + e4 + " CON LA CALIFICACION " + alum1.getNum2());
        resultado = alum3.esDiferenteQue(6, 10);
        System.out.println(resultado);
    }
}
