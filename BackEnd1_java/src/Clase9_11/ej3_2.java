

package Clase9_11;

import java.util.Scanner;

/**
 *
 * @author Brian
 */
public class ej3_2 {
    
    /*Escriba un programa que averigüe si dos vectores de N enteros son iguales 
    (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).*/
    
            public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);
                System.out.println("Ingrese el tamaño del vector");
                int n = leer.nextInt();
                System.out.println("Llenado del primer vector");
                int[] vector1 = llenarVector(n);
                System.out.println("Llenado del segundo vector");
                int[] vector2 = llenarVector(n);
                verificaVector(vector1,vector2);              
            }
            
            //llena vector con numeros ingresados
            public static int[] llenarVector(int n){
                 int[] vector= new int[n];
                 Scanner leer = new Scanner(System.in);
                 
                for (int i=0 ; i<vector.length ; i++){
                    System.out.println("Ingrese el valor de la posición "+i);
                  vector[i]= leer.nextInt();
                }
                return vector;
            }
            
            public static void verificaVector(int[] vector1, int[] vector2){
                boolean resu = true;
                
                for (int i=0 ; i<vector1.length ; i++){
                    if (vector1[i]!=vector2[i]){
                        resu = false;
                        System.out.println("Los vectores NO son iguales");
                        break;
                    }
                }
                if (resu){
                    System.out.println("Ambos vectores son iguales");
                }
            }


}
