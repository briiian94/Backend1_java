/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
 */

package ej1_2;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class main {
            public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
                System.out.print("Ingrese el radio :");
                Circunferencia c1 = new Circunferencia(leer.nextDouble());
                
                System.out.println("Area = "+c1.calculaArea());
                System.out.println("Perimetro = "+c1.calculaPerimetro());
                System.out.println("Radio = "+c1.getRadio());
                
                
            }

}
