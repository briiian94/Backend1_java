

package Clase9_11;

import java.util.Random;


/**
 *
 * @author Brian
 */
public class ej2_4 {
    
  /*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre 
    la traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y
    se obtiene cambiando sus filas por columnas (o viceversa).
    */
            public static void main(String[] args) {
                int n=4;
                int[][] matriz = llenarMatriz(n);
                System.out.println("");
                invertirMatriz(matriz, n);
                
            }

            
                             //llena matriz con numeros aleatorios
            public static int[][] llenarMatriz(int n){
                
                 int[][] matriz = new int[n][n];
                 Random random = new Random();
                 
                 System.out.println("Matriz original");
                for (int i=0 ; i<matriz.length ; i++){
                    for (int j=0 ; j<matriz.length ; j++){
                  matriz[i][j]= random.nextInt(10);
                    System.out.print(matriz[i][j]+" ");
                    }
                    System.out.println("");
                }
                return matriz;
            }
            
            public static void invertirMatriz(int[][] matriz, int n){
                int[][] traspuesta = new int [n][n];
                
                for (int i=0 ; i<matriz.length ; i++){
                    for (int j=0 ; j<matriz.length ; j++){
                        traspuesta[j][i] = matriz[i][j];
                    }
                }
                imprimirMatriz(traspuesta);
            }
            
            public static void imprimirMatriz(int[][] traspuesta){
                System.out.println("Matriz traspuesta");
                for (int i=0 ; i<traspuesta.length ; i++){
                    for (int j=0 ; j<traspuesta.length ; j++){
                        System.out.print(traspuesta[i][j]+" ");
                    }
                    System.out.println("");
                }
            }
}
