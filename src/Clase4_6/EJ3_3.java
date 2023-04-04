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
public class EJ3_3 {
    /*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
    Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
*/
    
                 public static void main(String[] args) {
                     Scanner leer = new Scanner(System.in);
                     System.out.println("Ingrese una letra");
                     String letra = leer.nextLine().toUpperCase();
                     
                     if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")){
                         System.out.println("La letra ingresada es vocal");
                     } else {
                         System.out.println("La letra ingresada NO es vocal");
                     }
                     
                 }
}
