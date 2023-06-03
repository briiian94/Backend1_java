/*
 Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
 */
package backend_colecciones_guia10_1_4;

import entidades.Pelicula;
import java.util.ArrayList;
import servicios.PeliculaServicio;

/**
 *
 * @author brian
 */
public class BackEnd_Colecciones_Guia10_1_4 {

    public static void main(String[] args) {
        PeliculaServicio ps = new PeliculaServicio();
        ArrayList<Pelicula> peliculas = ps.crearPelicula();
        System.out.println("Muestra lista de peliculas con duracion mayor a 1hs");
        ps.mostrarPelicula(peliculas);
        System.out.println();
        System.out.println("Lista ordenada de mayor a menor");
        ps.ordenarDuracionMayor(peliculas);
        System.out.println();
        System.out.println("Lista ordenada de menor a mayor");
        ps.ordenarDuracionMenor(peliculas);
        System.out.println();
        System.out.println("Lista ordenada por titulo");
        ps.ordenarTitulo(peliculas);
        System.out.println();
        System.out.println("Lista ordenada por director");
        ps.ordenarDirector(peliculas);
    }

}
