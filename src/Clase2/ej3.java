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
public class ej3 {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
             System.out.println("Ingrese una frase");
             String frase = leer.nextLine();
             System.out.println("La frase en mayusculas es: "+frase.toUpperCase());
             System.out.println("La frase en minusculas es: "+frase.toLowerCase());
             
    }
}
