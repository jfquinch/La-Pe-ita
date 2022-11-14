package com.mycompany.entregafinal;
import java.util.Scanner;

public class EntregaFinal {

    public static void SumaProductos(String[] args) {
        Scanner sumando =new Scanner(System.in);//Importar clase Scanner para recibir datos por teclado
        int suma=0;//Se declara variable suma para almacenar datos
        for(int i=0;i<5;i++){//ciclo for hace que la operación se repita 5 veces 
        System.out.println("Ingrese el valor del producto: ");//solicita valores al usuario para realizar la operación correspondiente
        int nume=sumando.nextInt();//la variable "nume" almacena los datos ingresados en el scanner "sumando"
        suma=suma+nume;//Se suman los datos ingresados en "nume"
        System.out.println("El valor total de los productos es " + suma);//Por último se imprime el valor resultante de la operación
        }
    }
    public static void MultiplicacionProductos(String[] args) {
        Scanner multiplicando =new Scanner(System.in);//Importar clase Scanner para recibir datos por teclado
        int multiplicacion=0;//Se declara variable multiplicacion para almacenar datos
        for(int i=0;i<5;i++){//ciclo for hace que la operación se repita 5 veces 
        System.out.println("Ingrese el valor del producto: ");
        int nume1=multiplicando.nextInt();
        multiplicacion=multiplicacion*nume1;//se realiza la operación de multiplicación       
        System.out.println("El valor total de los productos es: "+multiplicacion);//Se imprime el resultado de la operación
        }
    }
     public static void PromedioProductos(String[] args) {
         Scanner recogerPromedio= new Scanner(System.in);
         int promedio;//se declara "Promedio" que será la que imprime el resultado de la operación realizada
         int p1,p2,p3,p4,p5;//se declaran variables para almacenar los valores del producto
             System.out.println("Ingrese valor del producto: ");//se solicita el valor del producto al usuario
             p1 = recogerPromedio.nextInt();//se almacena el dato ingresado por el scanner "recogerPromedio" en la variable 
             System.out.println("Ingrese valor del producto: ");
             p2 = recogerPromedio.nextInt();
             System.out.println("Ingrese valor del producto: ");
             p3 = recogerPromedio.nextInt();
             System.out.println("Ingrese valor del producto: ");
             p4 = recogerPromedio.nextInt();
             System.out.println("Ingrese valor del producto: ");
             p5 = recogerPromedio.nextInt();
             
             promedio=((p1+p2+p3+p4+p5)/5);//Se realiza la operación de promedio
             
             System.out.println("El valor promedio de los productos es: "+ promedio);//Se imprime valor en pantalla
         }
     }