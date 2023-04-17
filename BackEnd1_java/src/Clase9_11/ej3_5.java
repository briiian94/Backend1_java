

package Clase9_11;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Brian
 */
public class ej3_5 {
    /*Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios
    y muestre la suma de sus elementos.*/
    
            public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);
                System.out.println("Ingrese el tamaño de la matriz NxM");
                int n = leer.nextInt();
                int m = leer.nextInt();
                llenarMatriz(n,m);
                
                
            }
            
                            //llena matriz con numeros aleatorios
            public static void llenarMatriz(int n, int m){
                // llenamos la matriz
                 int[][] matriz = new int[n][m];
                 Random random = new Random();
                 int sum = 0;
                 //asignamos valores aleatorios a cada elemento de la matriz
                for (int i=0 ; i<n ; i++){
                    for (int j=0 ; j<m ; j++){
                  matriz[i][j]= random.nextInt(10);
                  sum+=matriz[i][j];
                    System.out.print(matriz[i][j]+" ");
                    }
                    System.out.println("");
                }
                // se muestra la suma de los elementos
                System.out.println("La suma de los elementos es: "+sum);
            }

}
