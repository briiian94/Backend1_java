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
public class EJ3_11 {
    /*/*
Escribir un programa que lea un número entero y devuelva el número de
dígitos que componen ese número. Por ejemplo, si introducimos el
número 12345, el programa deberá devolver 5. Calcular la cantidad de
dígitos matemáticamente utilizando el operador de división. Nota:
recordar que las variables de tipo entero truncan los números o
resultados.
 
package guia3ejex11;

import java.util.Scanner;


public class Guia3ejex11 {

   
    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in); 

        System.out.print("Ingrese un número entero: ");

        int num = sc.nextInt();

        int cantidadDigitos = 0;

        while (num != 0) {
            num = num / 10;
            cantidadDigitos++;
        }

        System.out.println("El número de dígitos es: " + cantidadDigitos);
    }
} */
                public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);
                    System.out.println("Escriba un numero entero de x digitos");
                    int num1 = leer.nextInt();
                    int cant=0;
                    
                    
                    while (num1 != 0) {
                    num1 = num1 / 10;
                    cant++;
                 }
                    System.out.println("Numero de digitos: "+cant);
                }
                
    
}
