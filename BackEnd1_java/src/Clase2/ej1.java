/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase2;

import java.util.Scanner;

/**
 *
 * @author Brian
 */
public class ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
       Scanner leer = new Scanner(System.in);
        int num1, num2, suma;
        System.out.println("Ingrese dos numero:");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        suma=num1+num2;
        System.out.println("La suma de los numeros ingresados es: "+suma);
        
    }
    
}
