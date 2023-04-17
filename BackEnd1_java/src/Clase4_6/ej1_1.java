package Clase4_6;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brian
 */
public class ej1_1 {
              
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Implementar un programa que le pida dos números enteros al usuario y 
        determine si ambos o alguno de ellos es mayor a 25*/
        
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        if (num1 > 25 && num2 > 25) {
            System.out.println("Ambos numberos ingresados son mayores a 25");
        } else if (num1 > 25) {
            System.out.println("El primer numero ingresado ("+num1+") es mayor a 25"); 
        } else if (num2 > 25) {
            System.out.println("El segundo numero ingresado ("+num2+") es mayor a 25"); 
        } else {
            System.out.println("Ninguno de los numeros ingresados es mayor a 25");
        }
    }
}
