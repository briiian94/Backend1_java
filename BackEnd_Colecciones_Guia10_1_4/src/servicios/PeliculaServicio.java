/*En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.

Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.

Después de ese bucle realizaremos las siguientes acciones:

Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.

 */
package servicios;

import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class PeliculaServicio {

    /*un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.*/
    public ArrayList<Pelicula> crearPelicula() {
        ArrayList<Pelicula> peliculas = new ArrayList();

        boolean confirmacion = true;
        do {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            Pelicula pelicula = new Pelicula();
            System.out.println("Ingrese el titulo de la pelicula");
            pelicula.setTitulo(leer.next());
            System.out.println("Ingrese el director de la pelicula");
            pelicula.setDirector(leer.next());
            System.out.println("Ingrese la duracion de la pelicula (en HORAS)");
            pelicula.setDuracion(leer.nextDouble());
            peliculas.add(pelicula);
            System.out.println("Desea ingresar otra pelicula? S/N");
            if (leer.next().equalsIgnoreCase("n")) {
                confirmacion = false;
            }

        } while (confirmacion);

        return peliculas;
    }

    /*• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.*/
    public void mostrarPelicula(ArrayList<Pelicula> peliculas) {

        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula.getTitulo());
            }
        }
    }

    /*• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.*/
    public void ordenarDuracionMayor(ArrayList<Pelicula> peliculas) {
        peliculas.sort(Pelicula.compararDuracion);
        Collections.reverse(peliculas);
        mostrar(peliculas);
    }

    /*Mostrar lista de peliculas*/
    public void mostrar(ArrayList<Pelicula> peliculas) {
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

    /*• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.*/
    public void ordenarDuracionMenor(ArrayList<Pelicula> peliculas) {
        peliculas.sort(Pelicula.compararDuracion);
        mostrar(peliculas);
    }

    /*  Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.*/
    public void ordenarTitulo(ArrayList<Pelicula> peliculas) {
        peliculas.sort(Pelicula.compararTitulo);
        mostrar(peliculas);
    }

    /* Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.*/
    public void ordenarDirector(ArrayList<Pelicula> peliculas) {
        peliculas.sort(Pelicula.compararDirector);
        mostrar(peliculas);
    }
}
