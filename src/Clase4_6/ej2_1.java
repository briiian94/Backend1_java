package Clase4_6;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brian
 */
public class ej2_1 {
    /*Crear un programa que dado un número determine si es par o impar.*/
    
                      
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();
        
        if (num1 % 2==0){
            System.out.println("El numero ingresado es PAR");
            
        } else {
            System.out.println("El numero ingresado es IMPAR");
        }
    }
}
