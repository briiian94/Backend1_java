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
public class ej1_6 {
                    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
*/
        
        for (int i=0 ; i<4;i++){
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese un numero comprendido entre 1 y 20");
            int num1 = leer.nextInt();
            if (num1<1 && num1>20){
                i=i-1;
            } else {
                System.out.print(num1+" ");
                for (int j=0; j<num1;j++){
                System.out.print("*");
                }
                System.out.println("");
            }    
        }
    }
}
