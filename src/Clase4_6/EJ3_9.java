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
public class EJ3_9 {
        public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
            System.out.println("Ingresar dos numeros enteros");
        int num1 =leer.nextInt();
        int num2 =leer.nextInt();
        
        int i=0;
        
        while (num1>=num2){
            num1=num1-num2;
            i++;
        }

            System.out.println("el cociente es : "+i);
            System.out.println("el residuo es : "+num1);
        }
    
}
