import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//EDGAR RAMOS CARRASCO 
public class EdgarR {
   public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
   public static String entrada;
   public static int area;
   public static char respuesta;
   //metodo imprime menu 
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
   public static double pagoHora(){
       double pagoHora;
       pagoHora = 160;
       return pagoHora;
   }
   //metodo por retardos 
   public static double descuentoPorRetardos() throws IOException{
        int retardos;
        double descuentoPorRetardos;
        System.out.println("Escribe el número de retardos por semana: ");
        entrada = bufer.readLine();
        retardos = Integer.parseInt(entrada);
        if ( retardos >= 3 ){
        descuentoPorRetardos = 100;
        }
        else 
        descuentoPorRetardos = 0;
        return descuentoPorRetardos;
   }
   //metodo descuento por faltas 
   public static double descuentoFaltas()throws IOException {
       int faltas;
       double descuentoPorFaltas, sueldoBase = 0;
       System.out.println("Escribe el número de faltas por semana: ");
       entrada = bufer.readLine();
       faltas = Integer.parseInt(entrada);
       if ( faltas > 0 ){
       descuentoPorFaltas = faltas * (sueldoBase * 0.10);
            }
            else
            descuentoPorFaltas = 0;
       return descuentoPorFaltas;
   }
   //metodo para antiguedad
   public static double bonoAntiguedad() throws IOException{
       int bonoAntiguedad;
       System.out.println("Tienes 5 o más años trabajando en la empresa? (S/N): ");
       entrada = bufer.readLine();
       char antiguedad = entrada.toUpperCase().charAt(0);
       if (antiguedad == 'S'){
       bonoAntiguedad = 200;
       }
        else 
           bonoAntiguedad = 0;
       return bonoAntiguedad;
   } 

   public static String  obterNombre(char nombre){
       return entrada;
   }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        
        int retardos;
        int faltas;
        double pagoHora = 0,re = 0;
        double sueldoBase;
        int horas;
        double descuentoPorRetardos,x1, x, x2;
        double descuentoPorFaltas;
        double bonoAntiguedad;
        double sueldoTotal;
        char antiguedad;
        char respuesta;
        
        
        do{
           imprimeMenu();
            entrada = bufer.readLine();
            area = Integer.parseInt(entrada);
        
            switch( area ){
            case 1: {
               re=pagoHora();
            }
                    break;
            case 2: pagoHora = 120;
                    break;
            case 3: pagoHora = 100;
                    break;
            case 4: pagoHora = 80;
                    break;
            case 5: pagoHora = 120;
            }
        
            System.out.println("Escribe el total de horas trabajadas a la semana: ");
            entrada = bufer.readLine();
            horas = Integer.parseInt(entrada);
        
            sueldoBase = horas *re;

            x1=descuentoPorRetardos();
            
            x=descuentoFaltas();
            
            x2=bonoAntiguedad();
        
            sueldoTotal = sueldoBase -re - x + x2-2020;
            
            System.out.println("El sueldo total semanal es: " + sueldoTotal);
            
            System.out.println("Calcular otro salario? (S/N): ");
            entrada = bufer.readLine();
            respuesta = entrada.toUpperCase().charAt(0);
        } while (respuesta == 'S');
    }
    
}