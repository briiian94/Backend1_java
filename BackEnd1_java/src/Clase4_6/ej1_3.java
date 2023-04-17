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
public class ej1_3 {
                
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                   /*Escriba un programa que valide si una nota está entre 0 y 10, 
        sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.*/
                   
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una nota del 1 al 10");
        int nota = leer.nextInt();
        
        while (nota<1 || nota>10) {
            System.out.println("Ingrese una nota valida, del 1 al 10");
            nota = leer.nextInt();
        }
        System.out.println("La nota ingresada es "+nota);
    }
}
