

package Clase9_11;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Brian
 */
public class ej3_3 {
    /*Crear una función rellene un vector con números aleatorios, 
    pasándole un arreglo por parámetro. Después haremos otra función o
    procedimiento que imprima el vector*/
    
            public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);
                System.out.println("Ingrese el tamaño del vector");
                int n = leer.nextInt();
                int[] vector = llenarVector(n);
                
                mostrarVector(vector);
                
            }
            
                             //llena vector con numeros aleatorios
            public static int[] llenarVector(int n){
                 int[] vector= new int[n];
                 Random random = new Random();
                 
                for (int i=0 ; i<vector.length ; i++){
                  vector[i]= random.nextInt(10);
                }
                return vector;
            }
            
            public static void mostrarVector(int[] vector){
                for (int i=0 ; i<vector.length ; i++){
                    System.out.print(vector[i]+" ");
                }
                System.out.println();
            }

}
