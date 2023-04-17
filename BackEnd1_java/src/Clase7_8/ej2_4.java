

package Clase7_8;

import java.util.Scanner;

/**
 *
 * @author Brian
 */
public class ej2_4 {
    
    /*Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro
    para que nos indique si es o no un número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo,
    ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
*/
            public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);
                System.out.println("Ingrese un numero");
                int num1 = leer.nextInt();
                
                primo(num1);
                boolean ret = primo(num1);
                if ( ret == true){
                System.out.println("El numero es primo");
                } else {
                    System.out.println("El numero no es primo");
                }
                
            }

            public static boolean primo(int num1){
                  if (num1 <= 1) {
                return false;
                }
                    for (int i = 2; i <= Math.sqrt(num1); i++) {
                        if (num1 % i == 0) {
                            return false;
                        }
                    }
                return true;
            }
}
            
