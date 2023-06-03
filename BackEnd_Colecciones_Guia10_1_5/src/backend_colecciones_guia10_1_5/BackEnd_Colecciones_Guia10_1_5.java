/*
 Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
 */
package backend_colecciones_guia10_1_5;

import java.util.LinkedHashSet;
import servicios.PaisServicio;

/**
 *
 * @author brian
 */
public class BackEnd_Colecciones_Guia10_1_5 {

    public static void main(String[] args) {

        PaisServicio ps = new PaisServicio();
        LinkedHashSet<String> pais = ps.cargaPais();
        ps.mostrarOrdenado(pais);
        ps.recorreYElimina(pais);


    }

}
