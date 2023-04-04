

package Clase7_8;

import java.util.Scanner;

/**
 *
 * @author Brian
 */
public class ej2_2 {
    
    /*Diseñe una función que pida el nombre y la edad de N personas e imprima los datos 
    de las personas ingresadas por teclado e indique si son mayores o menores de edad. 
    Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
    mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
*/
    
            public static void main(String[] args) {
                   Scanner leer = new Scanner(System.in);
                   System.out.print("Indique la cantidad de personas a ingresar: ");
                   int cant = leer.nextInt();
                   
                   for (int i=0;i<cant;i++){
                       
                       System.out.println("Ingrese el nombre y luego la edad");
                       String nombre=leer.next();
                       int edad=leer.nextInt();
                       if (edad<18){
                           System.out.println(nombre+" es MENOR de edad");
                       } else {
                           System.out.println(nombre+" es MAYOR de edad");
                       }
                       System.out.println("Desea continuar mostrando personas? indique (SI / NO)");
                       String opc = leer.next().toLowerCase();
                       if (!opc.equals("si")){
                           i=cant;
                       } 
                       
                   }
            }
}

            

