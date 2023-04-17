

package Clase7_8;

import java.util.Scanner;

/**
 *
 * @author Brian
 */
public class ej2_3 {
    
    /*Crea una aplicación que a través de una función nos convierta una cantidad de euros 
    introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras.
    La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena,
    este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
    El cambio de divisas es:
        * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 €

    */
    
    
            public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);
                System.out.println("Ingrese una cantidad de euros a convertir");
                double eur = leer.nextDouble();
                System.out.println("Ahora ingrese a que moneda desea convertir (Libras / Pesos / Yenes)");
                String moneda = leer.next().toLowerCase();
                
                convertidor(eur,moneda);
                
            }
            
            public static void convertidor(double eur, String moneda){
                
                switch (moneda){
                    case "libras":
                        double res = 0.86 * eur;
                        System.out.println(eur+" Euros = "+res+" Libras");
                        break;
                    case "pesos":
                        double res1 = 1.28611 * eur;
                        System.out.println(eur+" Euros = "+res1+" Pesos");
                        break;
                    case "yenes":
                        double res2 =129.852  * eur;
                        System.out.println(eur+" Euros = "+res2+" Yenes");
                    default:
                        System.out.println("Opcion incorrecta");
                }
                
            }
            

}
