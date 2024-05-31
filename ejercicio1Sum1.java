//Estudiante: Mario Herrera C.I.26296324 
//Universidad Bicentenaria de Aragua Programacion II Seccion: A
//Sumativa 1
//Ejercicio 1
// Escribir un programa en Java que permita realizar las siguientes conversiones de unidades de longitud: 

// Metros a centímetros.
// Metros a milímetros.
// Metros a pulgadas.
// Metros a pies.
// Metros a yardas.
import java.util.*;
public class ejercicio1Sum1{
    //Declaramos las constantes para realizar las convesiones
    private static final double centimetro = 100.0;
    private static final double milimetro = 1000.0;
    private static final double pulgada = 39.3701;
    private static final double pies = 3.28084;
    private static final double yarda = 1.09361;
    public static void main(String[] args) {
        //Inicializamos la clase scanners par recibir informacion
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese la cantidad en metros: ");
        double x = in.nextDouble();

        //Realizamos las conversiones
        double a = x * centimetro;
        double b = x * milimetro;
        double c = x* pulgada;
        double d = x * pies;
        double e = x * yarda;
        
        //Imprimir por pantalla las conversiones
        System.out.println(x + " su equivalencia en centrimetros es: " + a);
        System.out.println(x + " su equivalencia en milimetros es: " + b);
        System.out.println(x + " su equivalencia en pulgadas es: " + c);
        System.out.println(x + " su equivalencia en pies es: " + d);
        System.out.println(x + " su equivalencia en yardas es: " + e);

    }
}
