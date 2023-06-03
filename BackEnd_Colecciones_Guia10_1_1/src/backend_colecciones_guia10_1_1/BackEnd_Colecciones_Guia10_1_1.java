/*
 Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package backend_colecciones_guia10_1_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class BackEnd_Colecciones_Guia10_1_1 {

    public static void main(String[] args) {
        ArrayList<String> razaPerros = new ArrayList();
        Scanner leer = new Scanner(System.in);
        boolean confirmacion = true;
        do {
            System.out.println("Ingrese la raza del perro");
            razaPerros.add(leer.next());
            System.out.println("Desea agregar otro perro? (S/N)");
            String opc = leer.next().toUpperCase();
            if (opc.equals("N")) {
                confirmacion = false;
            }
        } while (confirmacion);

        System.out.println("Las razas ingresadas son:");
        for (String razaPerro : razaPerros) {
            System.out.println(razaPerro);

        }
        /*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.*/

        System.out.println("Ingrese una raza a ELIMINAR");
        String razaEliminar = leer.next();

        Iterator it = razaPerros.iterator();
        boolean noEncontrado = true;

        while (it.hasNext()) { //lo recorre mientras tenga elementos
            if (it.next().equals(razaEliminar)) {
                it.remove();
                noEncontrado = false;
                // break; //elimina el primero y sale del bucle
            }
        }

        if (noEncontrado) {
            System.out.println("La raza a eliminar no se encuentra en el listado");
        }

        System.out.println("Lista de razas");

        Collections.sort(razaPerros);
        for (String razaPerro : razaPerros) {
            System.out.println(razaPerro);

        }

    }

}
