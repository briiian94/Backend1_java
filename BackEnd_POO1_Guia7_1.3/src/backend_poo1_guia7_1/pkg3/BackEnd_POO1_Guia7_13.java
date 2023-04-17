/*Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, se deben crear los siguientes métodos:
Método constructor con todos los atributos pasados por parámetro.
Método constructor sin los atributos pasados por parámetro.
Métodos get y set.
Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado al main
Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
*/

package backend_poo1_guia7_1.pkg3;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class BackEnd_POO1_Guia7_13 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        Operacion op1 = new Operacion();
        op1.crearOperacion();
        
                System.out.println("La suma es = " +op1.sumar());
                System.out.println("La resta es = "+op1.restar());
                System.out.println("La multiplicación es  = "+op1.multiplicar());
                System.out.println("La división es  = "+op1.dividir());
    }
    
}
