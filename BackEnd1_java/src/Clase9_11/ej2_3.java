

package Clase9_11;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Brian
 */
public class ej2_3 {
    
    /*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
    cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
    */

            public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);
                System.out.println("Ingrese la cantidad de numeros del vector");
                int n = leer.nextInt();
                int[] vector= llenarVector(n);
                contabilizarDigitos(vector);
                
            }
                 //llena vector con numeros aleatorios
            public static int[] llenarVector(int n){
                 int[] vector= new int[n];
                 Random random = new Random();
                 
                for (int i=0 ; i<vector.length ; i++){
                  vector[i]= random.nextInt(100001);
                    System.out.println(vector[i]);
                }
                return vector;
            }
            
            public static void contabilizarDigitos(int[] vector){
                int unDigit =0;
                int dosDigit =0;
                int tresDigit =0;
                int cuatroDigit =0;
                int cincoDigit =0;
                
                
                for (int i=0 ; i<vector.length ; i++){
                   int digit = (int) Math.floor(Math.log10(vector[i])) + 1;

                  
                   switch (digit){
                    case 1:
                        unDigit++;
                        break;
                    case 2:
                        dosDigit++;
                        break;
                    case 3:
                        tresDigit++;
                        break;
                    case 4:
                        cuatroDigit++;
                        break;
                    case 5:
                        cincoDigit++;
                        break;
                    
                }
 
                }
                System.out.println("Existen "+unDigit+" numeros con 1 digito");
                System.out.println("Existen "+dosDigit+" numeros con 2 digitos");
                System.out.println("Existen "+tresDigit+" numeros con 3 digitos");
                System.out.println("Existen "+cuatroDigit+" numeros con 4 digitos");
                System.out.println("Existen "+cincoDigit+" numeros con 5 digitos");
            }

}
