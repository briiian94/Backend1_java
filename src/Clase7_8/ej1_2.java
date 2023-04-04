

package Clase7_8;

import java.util.Scanner;

/**
 *
 * @author Brian
 */
public class ej1_2 {
    
    /*Escribir un programa que procese una secuencia de caracteres ingresada por teclado
    y terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera:
    cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres
    (incluyendo a las vocales acentuadas) se mantienen sin cambios.
a e i o u
@ # $ % *
    
    Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación 
    correspondiente. Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
    
*/
            public static void main(String[] args) {
                   Scanner leer = new Scanner(System.in);
                   System.out.println("Ingrese una secuencia de caracteres, y terminada en punto");
                   String secuencia = leer.nextLine().toLowerCase();
                   
                   String nuevo = reemplazo(secuencia);
                   System.out.println(nuevo);
                   
            }
            
            public static String reemplazo(String secuencia){
                
                String nuevo="";
                
                for (int i=0; i<secuencia.length();i++){
                    char caracter = secuencia.charAt(i);
                    
                switch (caracter){
                    case 'a':
                        nuevo +='@';
                        break;
                    case 'e':
                        nuevo += '#';
                        break;
                    case 'i':
                        nuevo += '$';
                        break;
                    case 'o':
                        nuevo += '%';
                        break;
                    case 'u':
                        nuevo += '*';
                        break;
                    default:
                        nuevo += caracter;
                        break;      
                    }
                }
                return nuevo;
            }
}

