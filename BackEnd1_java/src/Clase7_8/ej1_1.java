/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clase7_8;

import java.util.Scanner;

/**
 *
 * @author Brian
 */
public class ej1_1 {
            public static void main(String[] args) {

                //Llamar funciones
               
                int resultado = suma(10,15);
                
                System.out.println("El resultado de la suma es "+resultado);
                
                
               
                Scanner leer = new Scanner(System.in);
                System.out.print("Ingrese su nombre: ");
                saludoPerzonalizado(leer.next());
                
            }
            
            public static int suma(int a, int b){
            
                //logica
                
                int resultado = a+b;
                
                return resultado;
            }
            
            public static void saludoPerzonalizado(String nombre){
                System.out.println("Hola "+nombre+" como estas?");
                
            }
                    

}
