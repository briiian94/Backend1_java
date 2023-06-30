package servicios;

import entidades.Cine;
import entidades.Espectador;
import entidades.Pelicula;
import entidades.Sala;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class CineServicio {

    public Pelicula ingresarPelicula() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Pelicula pelicula = new Pelicula();
        System.out.println("Ingresar titulo de pelicula");
        pelicula.setTitulo(leer.next());
        System.out.println("Ingresar duracion de pelicula");
        pelicula.setDuracion(leer.nextDouble());
        System.out.println("Ingresar edad minima para ver pelicula");
        pelicula.setEdadMin(leer.nextInt());
        System.out.println("Ingresar director de pelicula");
        pelicula.setDirector(leer.next());

        return pelicula;
    }

    public ArrayList<Espectador> generarEspectador() {

        ArrayList<Espectador> espectadores = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresar cantidad de espectadores a generar");
        int cantEsp = leer.nextInt();

        for (int i = 0; i < cantEsp; i++) {
            Espectador esp = new Espectador();
            System.out.println("Ingresar nombre");
            esp.setNombre(leer.next());
            System.out.println("Ingresar edad");
            esp.setEdad(leer.nextInt());
            System.out.println("Ingresar dinero disponible");
            esp.setDineroDisponible(leer.nextDouble());

            espectadores.add(esp);
        }
        return espectadores;
    }

    public Sala generarSala() {
        Sala salas = new Sala();
        String[][] asientos = new String[8][6];

        char letra = 'A';

        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
                if (i == 0) {
                    asientos[i][j] = "8" + letra;
                    letra++;

                } else {
                    asientos[i][j] = (8 - i) + String.valueOf(letra);
                    letra++;

                }
            }
            letra = 'A';
        }
        salas.setAsientos(asientos);
        return salas;
    }

    public void mostrarSala(Sala salas) {

        String[][] asientos = salas.getAsientos();

        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
                System.out.print(asientos[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public void ubicarEspectador(ArrayList<Espectador> espectadores, Pelicula pelicula, Sala sala) {
        Random random = new Random();
        int precioEntrada = 100;

        for (Espectador espectador : espectadores) {
            if (espectador.getDineroDisponible() >= precioEntrada && espectador.getEdad() >= pelicula.getEdadMin()) {
                boolean ocupado = true;
                do {
                    int f = random.nextInt(8);
                    int c = random.nextInt(6);
                    if (!sala.getOcupado()[f][c]) {
                        ocupado = false;
                        sala.getAsientos()[f][c] = sala.getAsientos()[f][c] + "X";
                        System.out.println("El espectador " + espectador.getNombre() + " tiene la ubicacion " + sala.getAsientos()[f][c]);
                        sala.getOcupado()[f][c] = true;
                    }
                } while (ocupado);
            }
        }

    }
}
