import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Practica1 {

    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;
    public static int area;
    
    public static void imprimeMenu(){
        System.out.println("Programa para calcular la nómina");
        System.out.println("Selecciona el área donde trabajas:");
        System.out.println("1 - Producción");
        System.out.println("2 - Mantenimiento");
        System.out.println("3 - Calidad");
        System.out.println("4 - Administración");
        System.out.println("5 - Sistemas");
        System.out.println("Escribe el número correspondiente: ");
   }

   public static double pagarArea(){
    switch( area ){
        case 1: return 160;
                
        case 2: return 120;
                
        case 3: return 100;
                
        case 4: return 80;
                
        case 5: return 120;
        }
    return 0;
   }

   public static double obtenerRetardo() throws IOException{
       int retardos;
    System.out.println("Escribe el número de retardos por semana: ");
    entrada = bufer.readLine();
    retardos = Integer.parseInt(entrada);
    if ( retardos >= 3 )
        return 100;
    else 
        return 0;
   }

   public static double obtenerDescuento(double sueldoBase) throws IOException{
       int faltas;
    System.out.println("Escribe el número de faltas por semana: ");
    entrada = bufer.readLine();
    faltas = Integer.parseInt(entrada);
    if ( faltas > 0 ){
        return (faltas * (sueldoBase * 0.10));
    }
    else
        return 0;
   }
   public static double obtenerBono() throws IOException{
    char antiguedad;
    System.out.println("Tienes 5 o más años trabajando en la empresa? (S/N): ");
    entrada = bufer.readLine();
    antiguedad = entrada.toUpperCase().charAt(0);
    if (antiguedad == 'S')
        return 200;
    else 
        return 0;
   }


    public static void main(String[] args) throws IOException {
        int retardos;
        int faltas;
        double pagoHora = 0;
        double sueldoBase;
        int horas;
        double descuentoPorRetardos;
        double descuentoPorFaltas;
        double bonoAntiguedad;
        double sueldoTotal;
        char antiguedad;
        char respuesta;
        
        
        do{
            imprimeMenu();

            entrada = bufer.readLine();
            area = Integer.parseInt(entrada);

            pagoHora=pagarArea();
            
            System.out.println("Escribe el total de horas trabajadas a la semana: ");
            entrada = bufer.readLine();
            horas = Integer.parseInt(entrada);

            sueldoBase = horas * pagoHora;

            descuentoPorRetardos= obtenerRetardo();

            descuentoPorFaltas=obtenerDescuento(sueldoBase);
            
            bonoAntiguedad=obtenerBono();
            
            
            
            sueldoTotal = sueldoBase - descuentoPorRetardos - descuentoPorFaltas + bonoAntiguedad;
            
            System.out.println("El sueldo total semanal es: " + sueldoTotal);
            
            System.out.println("Calcular otro salario? (S/N): ");
            entrada = bufer.readLine();
            respuesta = entrada.toUpperCase().charAt(0);
        } while (respuesta == 'S');
        
        
            
        
    }
    
}