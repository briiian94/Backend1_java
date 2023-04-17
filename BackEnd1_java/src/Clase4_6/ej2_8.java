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
public class ej2_8 {
    /*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
    Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
*/
    
     public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         int num1 = leer.nextInt();
         
         for (int i = 0 ; i < num1 ; i++) {
             for (int j = 0 ; j < num1 ; j++) {
                 if (i ==0 || i == num1-1 || j == 0 || j == num1-1){
                   System.out.print("* ");  
                 } else {
                     System.out.print("  ");
                 }
                 
               } 
             System.out.println();
             
         }
     }
    
}
