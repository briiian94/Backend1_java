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
public class EJ3_1 {
    /*Dado un tiempo en minutos, calcular su equivalente en días y horas. 
    Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente:
    1 día, 2 horas.*/
         public static void main(String[] args) {
             Scanner leer = new Scanner(System.in);
             System.out.println("Ingrese los minutos");
             int min = leer.nextInt();
             int dd,hh,mm;

             dd=min/1440;
             hh=dd%60;
             mm=min%60;
             System.out.println(dd+" dias, "+hh+" horas, "+mm+" minutos");
         }
}
