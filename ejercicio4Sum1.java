//Estudiante: Mario Herrera C.I.26296324 
//Universidad Bicentenaria de Aragua Programacion II Seccion: A
//Sumativa 1
//Ejercicio 4
// Escribir un programa en Java que modele la clase CuentaBancaria. La clase debe incluir los métodos 
// crear cinco objetos, y para imprimir por pantalla los valores de los atributos. 
// Dar formato para mostrar por pantalla.

import java.util.*;
import java.util.Scanner;
public class ejercicio4Sum1 {
    public static void main(String[] args) {
        //Inicializamos la clase Scanner para recibir informacion por pantalla
        Scanner in = new Scanner(System.in);
        //Inicializamos la variable
        int cedula;
        //Para simular que se accede a un banco pedimos cedula y contraseña
        System.out.println("Ingrese su cedula");
        cedula = in.nextInt();
        //Creamos otro objeto para que lea la clave aunque no se hace mas adelante en el programa
        Scanner in1 = new Scanner(System.in);
        System.out.println("Ingrese su contraseña");
        String clave = in1.nextLine();
        in.close();
        //Creamos los objetos solicitados por el ejercicio
        ClaseBancaria C1 = new ClaseBancaria(); 
        ClaseBancaria C2 = new ClaseBancaria();
        ClaseBancaria C3 = new ClaseBancaria();
        ClaseBancaria C4 = new ClaseBancaria();
        ClaseBancaria C5 = new ClaseBancaria();
        //Accedemos a los metodos a traves de los objetos creados
        C1.NumeroCuenta(cedula);
        C2.TipoCuenta();
        C3.Movimientos();
        C4.Saldo();
        C5.Directorio();
        
    }
}
//Creamos la clase ClaseBancaria donde esta los metodos y atributos solicitados en el ejercicio
class ClaseBancaria {
    //primer metodo
        void NumeroCuenta(int cedula){
            System.out.println("============================================================");
            System.out.println("Titular: Mario Herrera de Cedula: " + cedula);
            System.out.println("Numeronde cuenta: 0000-3471-9985-0001");
            System.out.println("============================================================");
        }
        //segundo metodo
        void TipoCuenta() {
            System.out.println("Tipo de cuenta: Corriente");
        }
        //tercer metodo
        void Movimientos() {
            System.out.println("Ultimos movimientos:");
            System.out.println("============================================================");
            System.out.println("Pago Movil a Piccola Europa 0000---**** por -120.46$");
            System.out.println("Cobro Transferencia de Chillout 0000---**** por 500.00$");
            System.out.println("Pago Transferencia a Borbone 0000---**** por -32.67$");
            System.out.println("============================================================");
        }
        //cuarto metodo
        void Saldo() {
            System.out.println("Saldo Total: 23764.46$");
        //quinto metodo
        void Directorio() {
            System.out.println("Directorio de afiliados");
            System.out.println("=========================");
            System.out.println("Alias: Mama");
            System.out.println("Myriam Carrasquel");
            System.out.println("V-5543065");
            System.out.println("Mercantil");
            System.out.println("=========================");
            System.out.println("Alias: Papa");
            System.out.println("Mario Herrera");
            System.out.println("V-3885714");
            System.out.println("Banesco");
            System.out.println("=========================");
            System.out.println("Alias: Enana");
            System.out.println("Raquel Gomez");
            System.out.println("V-28457000");
            System.out.println("Venezuela");
        }

}
}
