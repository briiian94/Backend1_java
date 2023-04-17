

package Clase9_11;


import java.util.Scanner;

/**
 *
 * @author Brian
 */
public class ej3_1 {
    /*Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N,
    con los valores ingresados por el usuario.
*/
    
            public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);
                System.out.println("Ingrese el tamaño del vector");
                int n = leer.nextInt();
                int[] vector = llenarVector(n);
                sumaVector(vector);              
            }
            
            //llena vector con numeros ingresados
            public static int[] llenarVector(int n){
                 int[] vector= new int[n];
                 Scanner leer = new Scanner(System.in);
                 
                for (int i=0 ; i<vector.length ; i++){
                    System.out.println("Ingrese el valor del vector "+i);
                  vector[i]= leer.nextInt();
                }
                return vector;
            }
            
            //Suma los valores del vector ingresado y los muestra por pantalla
            public static void sumaVector(int[] vector){
                int sum=0;
                for (int i=0 ; i<vector.length ; i++){
                    sum+=vector[i];
                }
                System.out.println("La suma de los vectores es: "+sum);
            }

}
