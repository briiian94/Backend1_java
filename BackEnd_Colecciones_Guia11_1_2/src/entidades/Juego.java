/*Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
/*Métodos:


10
•
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.*/
package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    private ArrayList<Jugador> jugadores;
    private Revolver revolver;

    public Juego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public Juego() {
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
    }

    /*• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.*/
    public void llenarJuego() {
        ArrayList<Jugador> jugadores = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de jugadores? maximo 6");
        int cant = leer.nextInt();
        int id = 1;
        for (int i = 0; i < cant; i++) {
            Jugador jugador = new Jugador(id);
            jugadores.add(jugador);
            id++;
            this.jugadores = jugadores;
            this.revolver = new Revolver();
            revolver.llenarRevolver();
        }
    }

    /* ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.*/
    public void ronda() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean jueg = true;
        do {
            for (Jugador jugador : jugadores) {
                jugador.disparo(revolver, jugador);
                System.out.println("Continuar");
                leer.next();
                if (jugador.isMojado()) {
                    System.out.println("Finalizo el juego, el jugador " + jugador.getNombre() + " Se mojó");
                    jueg = false;
                    break;
                }

            }

        } while (jueg);

    }

}
