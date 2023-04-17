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
public class EJ3_14 {
/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene
una M cantidad de hijos. Escriba un programa que pida la cantidad de
familias y para cada familia la cantidad de hijos para averiguar la media
de edad de los hijos de todas las familias.*/

  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de familias: ");
        int numFamilias = sc.nextInt();

        int totalHijos = 0;
        int totalEdades = 0;

        for (int i = 1; i <= numFamilias; i++) {
            System.out.print("Ingrese la cantidad de hijos de la familia: " + i + ": ");
            int numHijos = sc.nextInt();

            for (int j = 1; j <= numHijos; j++) {
                System.out.print("Ingrese la edad del hijo: " + j + " de la familia " + i + ": ");
                int edad = sc.nextInt();
            
                totalHijos++;
                totalEdades += edad;
            }
        }

        double mediaEdad = (double) totalEdades / totalHijos;
        System.out.println("La media de edad de los hijos de todas las familias es: "+mediaEdad);
    }
}

