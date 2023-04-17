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
public class EJ3_8 {
    /*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener
    la lectura y mostrar la cantidad de números leídos, la cantidad de números pares 
    y la cantidad de números impares. Al igual que en el ejercicio anterior los números negativos 
    no deben sumarse. Nota: recordar el uso de la sentencia break.*/
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i=0;
        int par=0;
        int impar=0;
        int mult=0;
        
        do {
            i = i + 1;
            System.out.println("Ingrese numeros enteros");
            int num = leer.nextInt();
            double mod = num % 2;
            
            if (num % 5 == 0){
                mult = 1;
                impar = impar +1;
            } else if (mod == 0){
                par = par + 1;
            } else if (mod != 0){
                impar = impar + 1;
            } 
        } while (mult == 0);
                System.out.println("La cantidad de numeros leidos es "+i);
                System.out.println("La cantidad de numeros pares es "+par);
                System.out.println("La cantidad de numeros impares es "+impar);
        } 
}
