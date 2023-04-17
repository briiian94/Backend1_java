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
public class ej2_5 {
    /*Escriba un programa en el cual se ingrese un valor límite positivo, 
    y a continuación solicite números al usuario hasta que la suma de los 
    números introducidos supere el límite inicial.*/
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor limite positivo");
        int numLimit = leer.nextInt();
        int sum = 0;
        do {
        Scanner leer1 = new Scanner(System.in);
        System.out.println("Ingrese numeros");
        int num1 = leer1.nextInt();
        sum = sum + num1;
        } while (sum <= numLimit);                      
    }
}
