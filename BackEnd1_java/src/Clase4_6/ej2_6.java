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
public class ej2_6 {
    /*Realizar un programa que pida dos números enteros positivos por teclado
    y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción 
    y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
    El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, 
    si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
    se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir 
    del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, 
    caso contrario se vuelve a mostrar el menú.*/
    
     public static void main(String[] args) {
         
     
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese dos numeros positivos");
         double num1 = leer.nextInt();
         double num2 = leer.nextInt();
         String op = "N";
         
         do {
             Scanner leer1 = new Scanner(System.in);
         System.out.println("MENU");
         System.out.println("1. Sumar");
         System.out.println("2. Restar");
         System.out.println("3. Multiplicar");
         System.out.println("4. Dividir");
         System.out.println("5. Salir");
         System.out.println("Elija opción:");
         int opcion = leer1.nextInt();
         
         switch (opcion){
             case 1:
                 double sum = num1+num2;
                 System.out.println("La suma es: "+sum);
                 break;
             case 2:
                 double res = num1-num2;
                 System.out.println("La resta es: "+res);
                 break;
             case 3:
                 double mul = num1*num2;
                 System.out.println("La multiplicación es: "+mul);
                 break;
             case 4:
                 double div = num1 / num2;
                 System.out.println("La división es: "+div);
                 break;
             case 5:
                 Scanner leer2 = new Scanner(System.in);
                 System.out.println("Esta seguro que desea salir del programa (S/N)?");
                 op = leer2.nextLine();
                     break;
                 } 
            }while (op.equals("N")); 
         }
}

     



         
             
                        

