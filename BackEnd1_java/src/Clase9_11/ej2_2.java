

package Clase9_11;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Brian
 */
public class ej2_2 {
    
    /*Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios 
    y le pida al usuario un número a buscar en el vector. El programa mostrará dónde 
    se encuentra el numero y si se encuentra repetido
    
    */
            public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);
                System.out.println("Ingrese el tamaño del vector");
                int n = leer.nextInt();

                
                int[] vector = llenarVector(n);
                buscarValor(vector);

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
            
            
                    //Busca un valor ingresado por el usuario, en el vector creado previamente.
             public static void buscarValor(int[] vector){
                Scanner leer1 = new Scanner(System.in);
                System.out.println("Ingresar un numero, y el mismo lo buscaremos en el vector");
                int num1 = leer1.nextInt();
                int cont=0;
                
                for (int i=0 ; i<vector.length ; i++){
                    if (num1==vector[i]){
                        cont++;
                        System.out.println("El numero se encuentra en la posición "+i+" del vector");
                    }
                }
                System.out.println("");
                System.out.println("El numero ingresado, se encuentra repetido "+cont+" veces");
            }

}
