/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase4_6;

import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Brian
 */
public class EJ3_10 {
    /*Realice un programa para que el usuario adivine el resultado de una multiplicación 
    entre dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al 
    usuario si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se 
    debe permitir al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio 
    investigue como utilizar la función Math.random() de Java.*/
    
            public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);
                Random num1 = new Random();
                int num2 = num1.nextInt(11);
                int num3 = num1.nextInt(11);
               /*int num2 = 2;
               int num3 = 3;    */
                int mult = num2*num3;
                int resu =0;
                
                do {
                    System.out.println("Adivine el resultado de una multiplicación de 2 numeros al azar");
                    resu = leer.nextInt();
                    if (resu != mult){
                        System.out.println("Incorrecto, vuelva a intentar");
                    }
                } while (resu!=mult);
                System.out.println("Correcto, adivino el resultado");
            }
}
