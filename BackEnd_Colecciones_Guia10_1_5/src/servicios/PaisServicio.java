/*El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)*/
package servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class PaisServicio {

    public LinkedHashSet<String> cargaPais() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        LinkedHashSet<String> paises = new LinkedHashSet();
        String opc = "s";
        do {
            System.out.println("Ingrese el nombre del pais a cargar");
            String peli = leer.next().toLowerCase();
            paises.add(peli);
            System.out.println("Desea ingresar otro pais? S/N");
            opc = leer.next().toLowerCase();
        } while (opc.equals("s"));

        return paises;

    }

    /*Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.*/
    public void mostrarOrdenado(LinkedHashSet<String> paises) {
        List<String> ordenada = new ArrayList(paises);
        Collections.sort(ordenada);
        System.out.println("A continuacion se muestra la lista de paises ordenada alfabeticamente");
        System.out.println(ordenada);
    }

    /*Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.*/
    public void recorreYElimina(LinkedHashSet<String> paises) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un pais a eliminar de la lista");
        String elim = leer.next();
        Iterator<String> it = paises.iterator();
        while (it.hasNext()) {
            if (paises.contains(elim)) {
                paises.remove(elim);
                break;
            } else {
                System.out.println("El pais no se encuentra en el listado");
                break;
            }
        }
        System.out.println(paises);

    }

}
