

package Clase9_11;

import java.util.Scanner;

/**
 *
 * @author Brian
 */
public class ej2_1 {
    
    /*Realizar un algoritmo que llene un vector con los 100 primeros números enteros
    y los muestre por pantalla en orden descendente.*/
    
            public static void main(String[] args) {
                Scanner leer=new Scanner(System.in);
                System.out.println("Ingrese la cantidad del vector");
                int n=leer.nextInt();

                //Llamar funcion
                llenarVector(n);
                
                
            }
            //llena vector con numeros indicados previamente
            public static void llenarVector(int n){
                 int[] vector= new int[n];
                 
                for (int i=0 ; i<vector.length ; i++){
                   vector[i]=i+1;
                }
                //llama funcion para imprimir numeros invertidos
                invertirVector(vector);
            }
            
            public static void invertirVector(int[] vector){
                
                for (int i=vector.length-1 ; i>=0 ; i--){
                    System.out.println(vector[i]);
                }
          }

}
