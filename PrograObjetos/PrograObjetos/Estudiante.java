import javax.print.PrintService;

public class Estudiante {
    private String matricula;
    private String nombre;
    private String carrera;
    private int cuatrimestre;
    private char grupo;
    private double adeudo=1060;


    public void pagarAdeudo(double pago){
        this.adeudo-=pago;
    }

    public void reportarAdeudo(){
        System.out.println("El adeudo del estudiante" + this.nombre +" es: "+ this.adeudo);
    }
    
}
