import javax.print.PrintService;

public class Estudiante {
    public String matricula;
    public String nombre;
    public String carrera;
    public int cuatrimestre;
    public char grupo;
    public double adeudo=1060;


    public void pagarAdeudo(double pago){
        this.adeudo-=pago;
    }

    public void reportarAdeudo(){
        System.out.println("El adeudo del estudiante" + this.nombre +" es: "+ this.adeudo);
    }
    
}
