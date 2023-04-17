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
public class EJ3_6 {
    /*Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
    por debajo de 1.60 mts. y el promedio de estaturas en general.*/
    
         public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
             System.out.println("Ingrese cantidad de personas a calcular");
             double cant = leer.nextInt();
             double sumGral=0;
             double sumPar=0;
             
             for (int i=0;i<cant;i++){
                 System.out.println("Ingrese la estatura de la persona "+(i+1));
                 double altura=leer.nextDouble();
                 sumGral=altura+sumGral;
                 if (altura<1.60){
                     sumPar=altura+sumPar;
                 }
             }
             double promGral=sumGral/cant;
             double promPar=sumPar/cant;
             
             System.out.println("El promedio de estatura general es "+promGral);
             System.out.println("El promedio de estatura por debajo de 1,60cm es "+promPar);
         }
    
}
