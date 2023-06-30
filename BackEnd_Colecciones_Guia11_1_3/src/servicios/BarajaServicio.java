/*Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.*/
package servicios;

import entidades.Baraja;
import entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BarajaServicio {

    public Baraja llenar() {
        Baraja baraja = new Baraja();
        String[] palos = {"Basto", "Copa", "Oro", "Espada"};
        ArrayList<Carta> mazo = new ArrayList();

        for (int i = 1; i <= 12; i++) {
            if (i == 8 || i == 9) {
                continue;
            }
            for (int j = 0; j < palos.length; j++) {
                mazo.add(new Carta(i, palos[j]));

            }
        }

        baraja.setMazo(mazo);

        return baraja;
    }

    //• barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar(Baraja baraja) {
        Collections.shuffle(baraja.getMazo());
        System.out.println("Se han barajado las cartas!");
    }

    //• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
    //se haya llegado al final, se indica al usuario que no hay más cartas.
    public void siguienteCarta(Baraja baraja) {
        ArrayList<Carta> monton = baraja.getMonton();
        if (baraja.getMazo().size() > 1) {
            Carta carta = baraja.getMazo().get(0);
            System.out.println("Se entregó la carta " + carta);
            monton.add(baraja.getMazo().get(0));
            baraja.getMazo().remove(0);
        } else if (baraja.getMazo().size() == 1) {
            System.out.println("Ultima carta");
            monton.add(baraja.getMazo().get(0));
            baraja.getMazo().remove(0);
        } else {
            System.out.println("No hay mas cartas en el mazo");
        }

    }

    //• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public int cartasDisponibles(Baraja baraja) {
        System.out.println("Quedan " + baraja.getMazo().size() + " Cartas disponibles para barajar");
        return baraja.getMazo().size();
    }

    /*• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.*/
    public void darCartas(Baraja baraja) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el numero de cartas a tomar ");
        int cantCartas = leer.nextInt();

        if (cantCartas > cartasDisponibles(baraja)) {
            System.out.println("No quedan cartas suficientes para tomar");
        } else {
            for (int i = 0; i < cantCartas; i++) {
                siguienteCarta(baraja);
            }
        }
    }

    /*• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario*/
    public void cartasMonton(Baraja baraja) {

        if (baraja.getMonton().isEmpty()) {
            System.out.println("Aun no ha salido ninguna carta");
        } else {
            System.out.println("Cartas que ya han salido " + baraja.getMonton());
        }
    }

    /*• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.*/
    public void mostrarBaraja(Baraja baraja) {
        System.out.println(baraja.getMazo());
    }
}
