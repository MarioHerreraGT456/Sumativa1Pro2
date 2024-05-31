//Estudiante: Mario Herrera C.I.26296324 
//Universidad Bicentenaria de Aragua Programacion II Seccion: A
//Sumativa 1
//Ejercicio 2
// Escribir un programa en Java para ingresar artículos (10) en el sistema de inventario de un supermercado: 
// nombre del artículo, precio y número de cajas.  Dar formato para mostrar por pantalla el resultado
import java.util.*;
import java.util.Scanner;

public class ejercicio2Sum1 {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        //Inicializamos la clase scanner para recibir informacion
        Scanner in = new Scanner(System.in);
        String nombre;
        double precio;
        int cantidad;
        System.out.println("Ingrese nombre del articulo");
        nombre = in.nextLine();
        System.out.println("Precio por unidad del articulo");
        precio = in.nextDouble();
        System.out.println("Cantidad de cajas del articulo");
        cantidad = in.nextInt();
        //creamos los objetos para pasar por parametros anteriormente dados
        //primer articulo de la lista
        art1 a1 = new art1();
        a1.Articulo(nombre, precio, cantidad);
        //creamos un objeto para borrar los datos anteriores para simular la lista
        BorrarDatos tec = new BorrarDatos();
        tec.borrar(nombre, precio, cantidad);
        tec.dato1();
        tec.dato2();
        tec.dato3();
        //objetos para el segundo articulo de la lista
        Scanner kk = new Scanner(System.in);
        System.out.println("Ingrese nombre del articulo");
        nombre = kk.nextLine();
        System.out.println("Precio por unidad del articulo");
        precio = kk.nextDouble();
        System.out.println("Cantidad de cajas del articulo");
        cantidad = kk.nextInt();
        art2 a2 = new art2();
        a2.Articulo(nombre, precio, cantidad);
        BorrarDatos tec1 = new BorrarDatos();
        tec1.borrar(nombre, precio, cantidad);
        tec1.dato1();
        tec1.dato2();
        tec1.dato3();
        //tercer articulo
        Scanner aa = new Scanner(System.in);
        System.out.println("Ingrese nombre del articulo");
        nombre = aa.nextLine();
        System.out.println("Precio por unidad del articulo");
        precio = aa.nextDouble();
        System.out.println("Cantidad de cajas del articulo");
        cantidad = aa.nextInt();
        art3 a3 = new art3();
        a3.Articulo(nombre, precio, cantidad);
        BorrarDatos tec2 = new BorrarDatos();
        tec2.borrar(nombre, precio, cantidad);
        tec2.dato1();
        tec2.dato2();
        tec2.dato3();
        //cuarto articulo
        Scanner bb = new Scanner(System.in);
        System.out.println("Ingrese nombre del articulo");
        nombre = bb.nextLine();
        System.out.println("Precio por unidad del articulo");
        precio = bb.nextDouble();
        System.out.println("Cantidad de cajas del articulo");
        cantidad = bb.nextInt();
        art4 a4 = new art4();
        a4.Articulo(nombre, precio, cantidad);
        BorrarDatos tec3 = new BorrarDatos();
        tec3.borrar(nombre, precio, cantidad);
        tec3.dato1();
        tec3.dato2();
        tec3.dato3();
        //quinto articulo
        Scanner cc = new Scanner(System.in);
        System.out.println("Ingrese nombre del articulo");
        nombre = cc.nextLine();
        System.out.println("Precio por unidad del articulo");
        precio = cc.nextDouble();
        System.out.println("Cantidad de cajas del articulo");
        cantidad = cc.nextInt();
        art5 a5 = new art5();
        a5.Articulo(nombre, precio, cantidad);
        BorrarDatos tec4 = new BorrarDatos();
        tec4.borrar(nombre, precio, cantidad);
        tec4.dato1();
        tec4.dato2();
        tec4.dato3();
        //sexto articulo
        Scanner dd = new Scanner(System.in);
        System.out.println("Ingrese nombre del articulo");
        nombre = dd.nextLine();
        System.out.println("Precio por unidad del articulo");
        precio = dd.nextDouble();
        System.out.println("Cantidad de cajas del articulo");
        cantidad = dd.nextInt();
        art6 a6 = new art6();
        a6.Articulo(nombre, precio, cantidad);
        BorrarDatos tec5 = new BorrarDatos();
        tec5.borrar(nombre, precio, cantidad);
        tec5.dato1();
        tec5.dato2();
        tec5.dato3();
        //septimo articulo
        Scanner ee = new Scanner(System.in);
        System.out.println("Ingrese nombre del articulo");
        nombre = ee.nextLine();
        System.out.println("Precio por unidad del articulo");
        precio = ee.nextDouble();
        System.out.println("Cantidad de cajas del articulo");
        cantidad = ee.nextInt();
        art7 a7 = new art7();
        a7.Articulo(nombre, precio, cantidad);
        BorrarDatos tec6 = new BorrarDatos();
        tec6.borrar(nombre, precio, cantidad);
        tec6.dato1();
        tec6.dato2();
        tec6.dato3();
        //octavo articulo
        Scanner ff = new Scanner(System.in);
        System.out.println("Ingrese nombre del articulo");
        nombre = ff.nextLine();
        System.out.println("Precio por unidad del articulo");
        precio = ff.nextDouble();
        System.out.println("Cantidad de cajas del articulo");
        cantidad = ff.nextInt();
        art8 a8 = new art8();
        a8.Articulo(nombre, precio, cantidad);
        BorrarDatos tec7 = new BorrarDatos();
        tec7.borrar(nombre, precio, cantidad);
        tec7.dato1();
        tec7.dato2();
        tec7.dato3();
        //noveno articulo
        Scanner gg = new Scanner(System.in);
        System.out.println("Ingrese nombre del articulo");
        nombre = gg.nextLine();
        System.out.println("Precio por unidad del articulo");
        precio = gg.nextDouble();
        System.out.println("Cantidad de cajas del articulo");
        cantidad = gg.nextInt();
        art9 a9 = new art9();
        a9.Articulo(nombre, precio, cantidad);
        BorrarDatos tec8 = new BorrarDatos();
        tec8.borrar(nombre, precio, cantidad);
        tec8.dato1();
        tec8.dato2();
        tec8.dato3();
        //decimo articulo
        Scanner hh = new Scanner(System.in);
        System.out.println("Ingrese nombre del articulo");
        nombre = hh.nextLine();
        System.out.println("Precio por unidad del articulo");
        precio = hh.nextDouble();
        System.out.println("Cantidad de cajas del articulo");
        cantidad = hh.nextInt();
        art10 a10 = new art10();
        a10.Articulo(nombre, precio, cantidad);
        BorrarDatos tec9 = new BorrarDatos();
        tec9.borrar(nombre, precio, cantidad);
        tec9.dato1();
        tec9.dato2();
        tec9.dato3();
        //Imprimos por pantalla los articulo ingresados por el usuario
        System.out.println("==========================================================");
        System.out.println("Articulo ║ Precio/Unidad ║ N° de Cajas");
        System.out.println(a1.B1() + " " + a1.B2() + "$ " + a1.B3() );
        System.out.println(a2.B1() + " " + a2.B2() + "$ " + a2.B3() );
        System.out.println(a3.B1() + " " + a3.B2() + "$ " + a3.B3() );
        System.out.println(a4.B1() + " " + a4.B2() + "$ " + a4.B3() );
        System.out.println(a5.B1() + " " + a5.B2() + "$ " + a5.B3() );
        System.out.println(a6.B1() + " " + a6.B2() + "$ " + a6.B3() );
        System.out.println(a7.B1() + " " + a7.B2() + "$ " + a7.B3() );
        System.out.println(a8.B1() + " " + a8.B2() + "$ " + a8.B3() );
        System.out.println(a9.B1() + " " + a9.B2() + "$ " + a9.B3() );
        System.out.println(a10.B1() + " " + a10.B2() + "$ " + a10.B3() );
        System.out.println("==========================================================");
    }
}
/**
 * Borrar
 */
//La clase para borrar los datos y rentornarlos sin valor para reutilizar
class BorrarDatos {
    String nombre;
    double precio;
    int cantidad;
    //metodo que recibe los parametros
  void borrar(String nombre, double precio, int cantidad) {
    nombre = "";
    precio = 0;
    cantidad = 0;
  }
  //A partir de aqui devuelve el nuevo valor de los atributos
public String dato1() {
    return nombre;
}
public double dato2(){
    return precio;
}
public int dato3(){
    return cantidad;
}
    
}
//Usamos una clase abstracta para que herede cada dato ingresado por el usuario
abstract class Inventario {
    String nombre;
    double precio;
    int cantidad;
   public abstract void Articulo(String nombre, double precio, int cantidad);
   
}
//se crea las clases para guardar los datos de cada articulo y luego
//esos datos lo here la clase abstracta "Inventario"
class art1 extends Inventario {
    String nombre;
        double precio;
        int cantidad;
    public void Articulo(String nombre, double precio, int cantidad){
      this.nombre = nombre;
      this.precio = precio;
      this.cantidad = cantidad;
    }
    public String B1() {
        return nombre;
    }
    public double B2(){
        return precio;
    }
    public int B3(){
        return cantidad;
    }
}
class art2 extends Inventario {
    String nombre;
        double precio;
        int cantidad;
    public void Articulo(String nombre, double precio, int cantidad){
      this.nombre = nombre;
      this.precio = precio;
      this.cantidad = cantidad;
    }
    public String B1() {
        return nombre;
    }
    public double B2(){
        return precio;
    }
    public int B3(){
        return cantidad;
    }
}
class art3 extends Inventario {
    String nombre;
        double precio;
        int cantidad;
    public void Articulo(String nombre, double precio, int cantidad){
      this.nombre = nombre;
      this.precio = precio;
      this.cantidad = cantidad;
    }
    public String B1() {
        return nombre;
    }
    public double B2(){
        return precio;
    }
    public int B3(){
        return cantidad;
    }
}
class art4 extends Inventario {
    String nombre;
        double precio;
        int cantidad;
    public void Articulo(String nombre, double precio, int cantidad){
      this.nombre = nombre;
      this.precio = precio;
      this.cantidad = cantidad;
    }
    public String B1() {
        return nombre;
    }
    public double B2(){
        return precio;
    }
    public int B3(){
        return cantidad;
    }
}
class art5 extends Inventario {
    String nombre;
        double precio;
        int cantidad;
    public void Articulo(String nombre, double precio, int cantidad){
      this.nombre = nombre;
      this.precio = precio;
      this.cantidad = cantidad;
    }
    public String B1() {
        return nombre;
    }
    public double B2(){
        return precio;
    }
    public int B3(){
        return cantidad;
    }
}
class art6 extends Inventario {
    String nombre;
        double precio;
        int cantidad;
    public void Articulo(String nombre, double precio, int cantidad){
      this.nombre = nombre;
      this.precio = precio;
      this.cantidad = cantidad;
    }
    public String B1() {
        return nombre;
    }
    public double B2(){
        return precio;
    }
    public int B3(){
        return cantidad;
    }
}
class art7 extends Inventario {
    String nombre;
        double precio;
        int cantidad;
    public void Articulo(String nombre, double precio, int cantidad){
      this.nombre = nombre;
      this.precio = precio;
      this.cantidad = cantidad;
    }
    public String B1() {
        return nombre;
    }
    public double B2(){
        return precio;
    }
    public int B3(){
        return cantidad;
    }
}
class art8 extends Inventario {
    String nombre;
        double precio;
        int cantidad;
    public void Articulo(String nombre, double precio, int cantidad){
      this.nombre = nombre;
      this.precio = precio;
      this.cantidad = cantidad;
    }
    public String B1() {
        return nombre;
    }
    public double B2(){
        return precio;
    }
    public int B3(){
        return cantidad;
    }
}
class art9 extends Inventario {
    String nombre;
        double precio;
        int cantidad;
    public void Articulo(String nombre, double precio, int cantidad){
      this.nombre = nombre;
      this.precio = precio;
      this.cantidad = cantidad;
    }
    public String B1() {
        return nombre;
    }
    public double B2(){
        return precio;
    }
    public int B3(){
        return cantidad;
    }
}
class art10 extends Inventario {
    String nombre;
        double precio;
        int cantidad;
    public void Articulo(String nombre, double precio, int cantidad){
      this.nombre = nombre;
      this.precio = precio;
      this.cantidad = cantidad;
    }
    public String B1() {
        return nombre;
    }
    public double B2(){
        return precio;
    }
    public int B3(){
        return cantidad;
    }
}
