/*Crear una clase llamada Libro que contenga los 
siguientes atributos: ISBN, Título, Autor, Número 
de páginas, y un constructor con todos los atributos
pasados por parámetro y un constructor vacío. 
Crear un método para cargar un libro pidiendo los datos
al usuario y luego informar mediante otro método
el número de ISBN, el título, el autor del libro y el
número de páginas.
*/
package backend_poo1;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class BackEnd_POO1 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Libro l1 = new Libro(leer.nextLine(), leer.nextLine() , leer.nextLine() , leer.nextLine());
        
        System.out.println("ISBN: "+l1.ISBN);
        System.out.println("Titulo: "+l1.titulo);
        System.out.println("Autor del libro: "+l1.autor);
        System.out.println("Numero de paginas: "+l1.numPag);
        
    }
    
}
