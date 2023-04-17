

package Clase9_11;

import java.util.Scanner;

/**
 *
 * @author Brian
 */
public class ej2_5 {
    /*Realice un programa que compruebe si una matriz dada es antisimétrica. 
    Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta,
    pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta de 
    una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
*/
    
            public static void main(String[] args) {
                int n=3;
                int[][] matriz = llenarMatriz(n);
                System.out.println("");
                
                boolean result = verificarTraspuesta(matriz);
                if (result){
                System.out.println("La matriz es  antisimétrica");
                } else {
                    System.out.println("La matriz NO es antisimétrica");
                }
                
            }
                //llena matriz con numeros aleatorios
            public static int[][] llenarMatriz(int n){
                
                 int[][] matriz = new int[n][n];
                 Scanner leer = new Scanner(System.in);
                 
                 System.out.println("Matriz original");
                for (int i=0 ; i<matriz.length ; i++){
                    for (int j=0 ; j<matriz.length ; j++){
                  matriz[i][j]= leer.nextInt(); 
                    System.out.print(matriz[i][j]+" ");
                    }
                    System.out.println("");
                }
                return matriz;
            }
            
                        
                        public static boolean verificarTraspuesta(int[][] matriz){
                            boolean result = true;
                            
                        for (int i=0 ; i<matriz.length ; i++){
                             for (int j=0 ; j<matriz.length ; j++){
                             if (matriz[i][j] != matriz[j][i]){
                                 result = false;
                                 break;
                                 }
                             }
                             if (!result){
                                 break;
                             }
                           }

                            return result;
                        }
}
