/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase4_6;

import java.util.Scanner;

/**
 *
 * @author Brian
 */
public class EJ3_7 {
    /*Realice un programa que calcule y visualice el valor máximo, 
    el valor mínimo y el promedio de n números (n>0). 
    El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario.
    Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.*/
          
    /*   public static void main(String[] args) {
                 Scanner leer = new Scanner(System.in);
                 System.out.println("Ingrese la cantidad de numeros a calcular");
                 int cant = leer.nextInt();
                 int i=0;
                 int min=0;
                 int max=0;
                 double pro=0;
                 
                 while (i<cant){
                     i=i+1;
                     System.out.println("Ingrese el valor n°"+i);
                     int num1=leer.nextInt();
                     if (i==1){
                         min=num1;
                     }
                     pro=pro+num1;
                     if (num1>max){
                         max = num1;
                     } else if (num1<min){
                         min=num1;
                     }
                 }
                 pro=pro/cant;
                 System.out.println("el valor minimo es "+min);
                 System.out.println("el valor maximo es "+max);
                 System.out.println("el promedio es "+pro);
             }*/
    
                 public static void main(String[] args) {
                 Scanner leer = new Scanner(System.in);
                 System.out.println("Ingrese la cantidad de numeros a calcular");
                 int cant = leer.nextInt();
                 int i=0;
                 int min=0;
                 int max=0;
                 double pro=0;
                 
                 do {
                     i=i+1;
                     System.out.println("Ingrese el valor n°"+i);
                     int num1=leer.nextInt();
                     if (i==1){
                         min=num1;
                     }
                     pro=pro+num1;
                     if (num1>max){
                         max = num1;
                     } else if (num1<min){
                         min=num1;
                     }
                 } while (i<cant);
                 pro=pro/cant;
                 System.out.println("el valor minimo es "+min);
                 System.out.println("el valor maximo es "+max);
                 System.out.println("el promedio es "+pro);
             }
    
}
