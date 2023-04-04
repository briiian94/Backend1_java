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
public class ej5 {
                
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
             System.out.println("Ingrese un numero entero");
             int num1 = leer.nextInt();
             System.out.println("El DOBLE del número ingresado es: "+num1*2);
             System.out.println("El TRIPLE del número ingresado es: "+num1*3);
             Double num2 = Math.sqrt(num1);
             System.out.println("La raiz cuadrada del número ingresado es: "+num2);
             

             
    }
}
