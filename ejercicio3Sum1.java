//Estudiante: Mario Herrera C.I.26296324 
//Universidad Bicentenaria de Aragua Programacion II Seccion: A
//Sumativa 1
//Ejercicio 3
// Escribir un programa en Java para calcular el salario neto de un trabajador en función del número de 
// horas trabajadas, precio de la hora de trabajo y, considerando unos descuentos fijos, 
// el sueldo bruto en concepto de impuestos (20 por 100). Dar formato para mostrar por pantalla el resultado
import java.text.DecimalFormat;
import java.util.*;
import java.util.Scanner;
public class ejercicio3Sum1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Inicializamos las variables
        String nombre;
        double horas, bruto, neto;
        int cedula;
        //Pedimos los datos la usuario
        System.out.println("Ingrese su nombre");
        nombre = in.nextLine();
        System.out.println("Ingrese su cedula");
        cedula = in.nextInt();
        System.out.println("Ingrese la cantidad de horas trabajadas");
        horas = in.nextDouble();
        //Creamos los objetos donde hacemos las operaciones
        sueldobruto fame = new sueldobruto();
        fame.CaclBruto(horas);
        bruto = fame.Resultado();
        sueldoneto zinc = new sueldoneto();
        zinc.CalcNeto(bruto);
        neto = zinc.Total();
        //Hacemos el formato pedido
        System.out.println("================================================");
        System.out.println("================================================");
        System.out.println("                                                 ");
        System.out.println("Nike");
        System.out.println("Nombre del trabajor:");
        System.out.println(nombre);
        System.out.println("Cedula de Identidad (C.I.):");
        System.out.println(cedula);
        System.out.println("Quincena correspondiente a:");
        System.out.println("del 01 de mayo de 2024 a 15 de mayo de 2024");
        System.out.println("================================================");
        System.out.println("Concepto                  ║ Valor ║");
        System.out.println("Horas Trabajadas          ║ " + horas + " ║");
        System.out.println("Precio por hora           ║ 1.956 ║" );
        System.out.println("Impuesto sobre la renta   ║  20%  ║");
        //Para mostrar solo dos decimales
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Sueldo Bruto              ║ " + df.format(bruto) + " ║");
        System.out.println("================================================");
        System.out.println("     SUELDO NETO          ║ " + neto + " ║");
        System.out.println("================================================");
        System.out.println("Firmado por:");
        System.out.println("________________________");
        

        

    }
}
class sueldobruto {
    private static final double preciohora = 1.956;
    double bruto;
    void CaclBruto (double horas) {
      bruto = horas * preciohora;
    }
    public double Resultado() {
      return bruto;
    }
}
class sueldoneto {
    private static final double descuento = 0.20;
    double neto,desc;
    void CalcNeto (double bruto) {
       desc = bruto * descuento;
       neto = bruto - desc;
    }
    public double Total() {
        return neto;
    }

}