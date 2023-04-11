

package Clase9_11;

import java.util.Scanner;

/**
 *
 * @author Brian
 */
public class ej2_6 {
    
    /*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde
    la suma de sus filas, sus columnas y sus diagonales son idénticas. 
    Crear un programa que permita introducir un cuadrado por teclado y determine 
    si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos 
    son correctos, es decir, están entre el 1 y el 9.*/
    
           public static void main(String[] args) {
             
                Scanner leer = new Scanner(System.in);
                System.out.print("Tamaño de matriz: ");
                int n = leer.nextInt();
                
                int[][] matriz=llenarMatriz(n);
                matrizMagica(matriz);

                
            }
            
                           //llena matriz con numeros ingresados por el usuario
            public static int[][] llenarMatriz(int n){
                
                 int[][] matriz = new int[n][n];
                 Scanner leer = new Scanner(System.in);
                 
                 System.out.println("Ingrese los valores de la matriz del 1 al 9");
                for (int i=0 ; i<matriz.length ; i++){
                    for (int j=0 ; j<matriz.length ; j++){
                        do {
                        System.out.print("Ingrese el valor de "+i+" "+j+": ");
                  matriz[i][j]= leer.nextInt(); 
                        } while (matriz[i][j]<=0 || matriz[i][j]>=10);
                    }
                    System.out.println("");
                }
                return matriz;
            }

            
            public static void matrizMagica(int[][] matriz){
                boolean magico=true;
                int sumD1=0;
                int sumD2=0;
                    int sumF=0;
                    int sumC=0;
                
                for (int i=0 ; i<matriz.length ; i++){
                    sumF=0;
                    sumC=0;
                    for (int j=0; j<matriz.length ; j++){
                        sumF=sumF+matriz[i][j];
                        sumC=sumC+matriz[j][i];
                        if (i==j){
                            sumD1=sumD1+matriz[i][j];
                        } 
                        if (j==matriz.length-i-1){
                            sumD2=sumD2+matriz[i][j];
                        }
                    }
                    if (sumF!=sumC){
                        magico=false;
                        break;
                    }
                    
                    } 
                if (sumF!=sumC || sumF!=sumD1 || sumF!=sumD2){
                        magico=false;
                        
                }
                if (magico){
                    System.out.println("La matriz es magica");
                } else {
                    System.out.println("La matriz No es magica");
                }
                
            }
}
