/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
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
luego se llama al método, este no mostrara esa primera carta.
 */
package backend_colecciones_guia11_1_3;

import entidades.Baraja;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.BarajaServicio;

public class BackEnd_Colecciones_Guia11_1_3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        BarajaServicio bs = new BarajaServicio();
        Baraja baraja1 = bs.llenar();
        int opc = 0;
        do {
            System.out.println("");
            System.out.println("Ingrese una opcion del menu");
            System.out.println("1. Barajar");
            System.out.println("2. Siguiente carta");
            System.out.println("3. Mostrar cantidad de cartas disponibles");
            System.out.println("4. Dar cartas");
            System.out.println("5. Mostrar cartas del monton");
            System.out.println("6. Mostrar cartas de baraja");
            System.out.println("7. Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    bs.barajar(baraja1);
                    break;
                case 2:
                    bs.siguienteCarta(baraja1);
                    break;
                case 3:
                    bs.cartasDisponibles(baraja1);
                    break;
                case 4:
                    bs.darCartas(baraja1);
                    break;
                case 5:
                    bs.cartasMonton(baraja1);
                    break;
                case 6:
                    bs.mostrarBaraja(baraja1);
                    break;
                case 7:
                    System.out.println("Hasta luego");
                    break;
            }
        } while (opc != 7);

    }

}
